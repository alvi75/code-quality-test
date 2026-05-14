import java.util.*;

public class Translation457 {
    ublic void setDate(@Nullable final Date date) {
    if (date != null) {
        setDate(DateTools.timeToString(date.getTime(), DateTools.Resolution.SECOND));
    }
    else {
        this.date = null;
    }
}
}