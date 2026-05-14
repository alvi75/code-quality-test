import java.util.*;

public class Translation289 {
    1 public void setRefLogMessage(String msg, boolean appendStatus) {
    2 if (msg == null && !appendStatus)3 disableRefLog();
    4 else5 if (msg == null && appendStatus)6 refLogMessage = "";
    7 else8 refLogMessage = msg;
    9 refLogIncludeResult = appendStatus;
}
}