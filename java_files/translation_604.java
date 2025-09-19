import java.util.*;

public class Translation604 {
    public List<Head> getNextHeads(char c) {
    if(matches(c))return new ArrayList<>(nextHeads);
    else return Collections.emptyList();
}
}