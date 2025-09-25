import java.util.*;

public class Translation457 {
    public void setDate(LocalDateTime date) {
    if (date == null) {
        setDate(null);
        return;
    }
    this.date = date.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
}
}