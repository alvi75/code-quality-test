import java.util.*;

public class Translation457 {
    public void setDate(Date date) {
    if (date != null) {
        setDate(DateTools.dateToString(date, Resolution.SECOND));
    }
    else {
        this.date = null;
    }
}
}