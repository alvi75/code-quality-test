import java.util.*;

public class Translation457 {
    1 public void setDate(Date date) {
    if (date != null) {
        setDate(DateTools.timeToString(date.getTime(), DateTools.Resolution.SECOND));
    }
    else {
        this.date = null;
    }
}
}