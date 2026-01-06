import java.util.*;

public class Generated_636766fa1a6d9265ec0177a9 {
    /**Add abstractType to the initializations variable.**/
    private void addInitializedType(final int abstractType) {
        if (abstractType == 0) {
            return;
        }
        final String type = getAbstractTypeName(abstractType);
        final String name = "initialization_" + abstractType;
        final String init = "this." + type + " = " + name + ";";
        this.initializations.add(init);
    }
}