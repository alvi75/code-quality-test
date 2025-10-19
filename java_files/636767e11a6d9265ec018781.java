import java.util.*;

public class Generated_636767e11a6d9265ec018781 {
    @Override
    public void accept(final METRICS data) {
        final String key = getKey(data);
        final MetricsBuffer metricsBuffer = getMetricsBuffer(key);

        if (metricsBuffer == null){
            metricsBuffer = new MetricsBuffer();
            putMetricBuffer(key, metricsBuffer);
        }

        metricsBuffer.accept(data);
    }
}