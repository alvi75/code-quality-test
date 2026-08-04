import java.util.*;

public class Translation672 {
    public Collection<String> nameSet() {
    return Collections2.transform(dictionaryNameToID.keySet(), NAME_TO_URI);
}
}