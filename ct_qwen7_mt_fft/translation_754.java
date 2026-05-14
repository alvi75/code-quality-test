import java.util.*;

public class Translation754 {
    public void removeName(Name name) {
    int idx = getNameIndex((HSSFName)name);
    removeName(idx);
}
}