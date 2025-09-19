import java.util.*;

public class Translation766 {
    public void removeCustomProperties() {
    if (getCustomProperties().size() > 0) {
        remove1stProperty(PropertyIDMap.PID_CUSTOMPROPERTIES);
    }
    else {
        throw new IllegalStateException("The document does not contain any custom properties.");
    }
    break;
}
}
}