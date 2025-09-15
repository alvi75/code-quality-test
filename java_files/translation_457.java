import java.util.*;

public class Translationtranslation_457 {
    public void setDate(Calendar cal) {
        if (cal == null) {
            cal = Calendar.getInstance();
        }
        cal.setTime(DateTools.getJavaDate());
        setDate(cal.getTime());
    }
}