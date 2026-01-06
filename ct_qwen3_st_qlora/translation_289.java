import java.util.*;

public class Translation289 {
    ublic void setRefLogMessage(String msg, boolean appendStatus) {
    if (msg == null && !appendStatus)disableRefLog();
    else if (msg == null && appendStatus) {
        refLogMessage = "";
        refLogIncludeResult = true;
    }
    else {
        refLogMessage = msg;
        refLogIncludeResult = appendStatus;
    }
}
}