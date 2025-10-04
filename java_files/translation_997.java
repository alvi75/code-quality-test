import java.util.*;

public class Translation997 {
    public String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append("[SERIESLIST]\n");
    buffer.append(" .numSeries = ").append(getNumSeries()).append('\n');
    for (int i = 0;
    i < _numSeries;
    i++) {
        buffer.append(" .seriesNumber_").append(i).append(" = ").append(getSeriesNumber(i)).append('\n');
    }
    buffer.append("[/SERIESLIST]\n");
    return buffer.toString();
}
}