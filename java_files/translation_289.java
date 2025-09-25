import java.util.*;

public class Translation289 {
    public void setRefLogMessage(String msg, boolean appendStatus) {
    if (msg == null && !appendStatus)disableRefLog();
    elserefLogMessage = (msg != null ? msg : "");
    refLogIncludeResult = appendStatus;
}
}