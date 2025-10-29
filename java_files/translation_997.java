import java.util.*;

public class Translation997 {
    01 public String toString() {
    02 StringBuffer buffer = new StringBuffer();
    03 buffer.append("[SERIESLIST]\n");
    04 buffer.append(" .seriesNumbers = ").append(" (").append(getSeriesNumbers()).append(" )\n");
    05 buffer.append("[/SERIESLIST]\n");
    06 return buffer.toString();
    07 }
}