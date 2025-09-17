import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class Translationtranslation_77 {
    public String getHumanishName() {
        if (getPath().equals("") || getPath() == null) {
            throw new IllegalStateException();
        }
        String s = getPath();
        List<String> elements;
        if (s.contains("/")) {
            elements = Arrays.asList(s.split("/"));
        }
        else {
            elements = Arrays.asList(s);
        }
        if (elements.size() == 3 && elements.get(0).equals("file")) {
            return elements.get(1);
        }
        return elements.get(elements.size() - 1);
    }
}