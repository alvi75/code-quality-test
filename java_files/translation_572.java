import java.util.*;

public class Translation572 {
    public void removeName(Name name) {
    int index = getNameIndex((HSSFName) name);
    removeName(index);
}
}