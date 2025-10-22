import java.util.*;

public class Translation457 {
    ublic void setDate(DateTime? date) {
    if (date != null) {
        setDate(DateTools.dateToString(date, DateTools.Resolution.SECOND));
    }
    else {
        this.date = null;
    }
}
}