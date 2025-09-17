import java.util.*;

public class Translationtranslation_47 {
    ublic void reset() {
        if (!first()) {
            ptr = 0;
            nextSubtreePos = 0;
            currentEntry = null;
            currentSubtree = null;
            if (!eof())parseEntry();
        }
    }
}