import java.util.*;

public class Translation457 {
    public void setDate(Date date) {
    if (date == null) {
        this.date = null;
    }
    else {
        setDate(DateTools.dateToString(date, DateTools.Resolution.SECONDS));
    }
}
}