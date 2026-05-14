import java.util.*;

public class Translation457 {
    1 public void setDate(@Nullable final DateTime date) {
    2 if (date != null) {
        3 setDate(DateTools.dateToString(date, DateTools.Resolution.SECOND));
        4 }
        else {
            5 this.date = null;
            6 }
        }
}