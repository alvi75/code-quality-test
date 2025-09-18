import java.util.*;

public class Translation457 {
    public void setDate(Calendar cal) {
    if (cal != null) {
        setDate(cal.getTime());
    }
    else {
        cal = Calendar.getInstance();
        cal.setTime(DateTools.getJavaDate());
        setDate(cal.getTime());
    }
}
}