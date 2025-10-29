import java.util.*;

public class Translation457 {
    public void setDate(java.util.Date date) {
    if (date != null) {
        setDate(DateTools.dateToString(date, DateTools.Resolution.SECOND));
    }
    else {
        clearDate();
    }
}
}