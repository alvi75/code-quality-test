import java.util.*;

public class Translation457 {
    public void setDate(final DateTime date) {
    if (date != null) {
        setDate(DateTools.dateToString(date, DateTools.RESOLUTION_SECOND));
    }
    else {
        this.date = null;
    }
}
}