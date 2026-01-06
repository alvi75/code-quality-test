import java.util.*;

public class Translation457 {
    public void setDate(Date date) {
    if (date != null) {
        setDate(DateTools.toISO8601String(date));
    }
    else {
        clearDate();
    }
}
}