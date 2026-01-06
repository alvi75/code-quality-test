import java.util.*;

public class Translation997 {
    ublic String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append("[SERIESLIST]\n");
    buffer.append(" .seriesNumbers = ").append(" (").append(getSeriesNumbers()).append(" )");
    buffer.append("\n[/SERIESLIST]\n");
    return buffer.toString();
}
}