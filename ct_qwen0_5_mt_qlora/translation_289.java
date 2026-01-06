import java.util.*;

public class Translation289 {
    public void setRefLogMessage(String msg, boolean appendStatus) {
    if (msg == null && !appendStatus) disableRefLog();
    else if (msg == null && appendStatus) refLogMessage = "";
    else refLogMessage = msg;
    refLogIncludeResult = appendStatus;
}
}