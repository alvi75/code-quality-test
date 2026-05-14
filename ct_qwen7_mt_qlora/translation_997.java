import java.util.*;

public class Translation997 {
    1 public String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append("[SERIESLIST]\n");
    buffer.append(" .seriesNumbers = ").append("(0x").append(Integer.toHexString(getSeriesNumbers())).append(") ");
    buffer.append("[/SERIESLIST]\n");
    return buffer.toString();
}
}