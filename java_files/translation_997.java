import java.util.*;

public class Translationtranslation_997 {
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("[SERIESLIST]\n");
        buffer.append(" .numSeries =").append(getNumSeries()).append("\n");
        for (int i = 0;
        i < getNumSeries();
        i++) {
            buffer.append(" .series=").append(getSeriesName(i)).append("\n");
            if (getExtSeriesNumber(i) != null) {
                buffer.append(" .extSeriesNo =").append(getExtSeriesNumber(i)).append("\n");
            }
            buffer.append("[/SERIES]\n");
        }
        return buffer.toString();
    }
}