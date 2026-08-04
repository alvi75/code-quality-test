import java.util.*;

public class Generated_636766fa1a6d9265ec0177a9 {
    public void addInitializedType(int abstractType) {
        if (initializedTypes == null) {
            initializedTypes = new int[1];
            initializedTypes[0] = abstractType;
        } else {
            int[] newInitializedTypes = new int[initializedTypes.length + 1];
            System.arraycopy(initializedTypes, 0, newInitializedTypes, 0, initializedTypes.length);
            newInitializedTypes[initializedTypes.length] = abstractType;
            initializedTypes = newInitializedTypes;
        }
    }
}