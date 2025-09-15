import java.util.*;

public class Translationtranslation_702 {
    public void next() {
        while (true) {
            if (currentSubtree != null)ptr += currentSubtree.getEntrySpan();
            elseptr++;
            if (eof())break;
            if (currentSubtree == null)nextSubtree();
        }
    }
}