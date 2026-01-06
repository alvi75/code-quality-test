import java.util.*;

public class Translation997 {
    public String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append("[SERIESLIST]\n");
    buffer.append(" .seriesNumbers = ").append(" (").append(getSeriesNumbers()).append(" )");
    buffer.append(System.getProperty("line.separator"));
    buffer.append("[/SERIESLIST]\n");
    return buffer.toString();
}
}