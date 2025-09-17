import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class Translationtranslation_604 {
    public List<Head> getNextHeads(char c) {
        if (matches(c)) {
            return newHeads;
        }
        return FileNameMatcher.EMPTY_HEAD_LIST;
    }
}