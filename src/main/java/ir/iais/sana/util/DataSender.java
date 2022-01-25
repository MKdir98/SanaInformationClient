package ir.iais.sana.util;

import ir.iais.sana.domain.sana.Data;
import ir.iais.sana.services.*;
import ir.iais.sana.ui.UiComponent;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

import java.util.ArrayList;
import java.util.List;

public abstract class DataSender<T extends Data> {
    private Label label;
    private PushSanaV5 pushSanaPort;
    private Long sanaId;

    public DataSender(PushSanaV5 pushSanaPort, List<T> data, int packetSize, Long sanaId, ProgressBar progressBar, Label label,
                      double initialProgressBarValue, String showMessageInLabel) {
        this.label = label;
        this.pushSanaPort = pushSanaPort;
        this.sanaId = sanaId;
        UiComponent.getInstance().setLabelValue(label, showMessageInLabel);
        List<List<T>> choppedData = chopped(data, packetSize);
        for (int i = 0; i < choppedData.size(); i++) {
            recursiveSend(choppedData.get(i));
            double progressBarValue = initialProgressBarValue + (i * 1.0 / choppedData.size()) * 0.05;
            UiComponent.getInstance().setProgressbarValue(progressBar, progressBarValue);
            UiComponent.getInstance().setLabelValue(label, label.getText().split(" ")[0] + " " + (i * 100.0 / choppedData.size()) + "%");
        }
    }

    private void recursiveSend(List<T> data) {
        try {
            long count = sendData(data, sanaId, pushSanaPort);
            if (count != data.size()) {
                recursiveSend(data);
            }
        } catch (DataNotFoundException_Exception | AccessException_Exception | RequestNotOpenException_Exception e) {
            UiComponent.getInstance().setLabelValue(label, e.getMessage());
        } catch (Exception ex) {
            UiComponent.getInstance().setLabelValue(label, ex.getMessage());
            recursiveSend(data);
        }
    }

    protected abstract long sendData(List<T> data, Long sanaId, PushSanaV5 pushSanaPort) throws InternalServerException_Exception, DataNotFoundException_Exception, RequestNotOpenException_Exception, AccessException_Exception;

    static <T> List<List<T>> chopped(List<T> list, final int l) {
        List<List<T>> parts = new ArrayList<>();
        final int N = list.size();
        for (int i = 0; i < N; i += l) {
            parts.add(new ArrayList<T>(
                    list.subList(i, Math.min(N, i + l)))
            );
        }
        return parts;
    }
}
