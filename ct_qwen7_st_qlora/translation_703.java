import java.util.*;

public class Translation703 {
    public TreeFilter clone() {
    final TreeFilter[] s = new TreeFilter[subfilters.length];
    for (int i = 0;
    i < s.length;
    i++)s[i] = subfilters[i].clone();
    return new List(s);
}
}