import java.util.*;

public class Generated_636766fa1a6d9265ec0177a9 {
    private void addInitializedType(final int abstractType) {
        if (abstractType == AbstractConfigValue.INITIALIZING_CONVERSION && !converting)
            throw new BugOrBroken("adding a non-conversion initalized type");
        // we don't need to remember anything for INITHALIZED_CONVERSION, but it's
        // convenient to do so.
        this.initializingAbstractType = abstractType;
    }
}