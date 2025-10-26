import java.util.*;

public class Translation997 {
    ublic override String toString(){
    StringBuilder buffer = new StringBuilder();
    buffer.Append("[SERIESLIST]\n");
    buffer.Append(" .seriesNumbers = ").Append(" (").Append(SeriesNumbers).Append(" )");
    buffer.Append(Environment.NewLine);
    buffer.Append("[/SERIESLIST]\n");
    return buffer.ToString();
}
}