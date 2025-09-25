import java.util.*;

public class Translation398 {
    public static java.util.Date getJavaDate(double date, boolean use1904windowing) {
    Calendar cal = new GregorianCalendar();
    cal.setTimeZone(TimeZone.getTimeZone("GMT"));
    if (use1904windowing && date >= -2209587040000D) {
        date -= 3600000L;
    }
    int year = 1;
    for (;
    ;
    ){
        try{
            cal.set(year, 1, 1);
            int dayOfYear = cal.get(Calendar.DAY_OF_YEAR);
            if (dayOfYear > 60){
                year++;
            }
            else{
                return cal.getTime();
            }
        }
        catch (Exception e){
            if (year == 9999){
                throw new ArgumentException("Year 9999 is not representable by a java.util.Date", "date");
            }
        }
    }
}
}