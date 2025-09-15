import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class Translationtranslation_77 {
    public String getHumanishName() {
        if (getPath().isEmpty())throw new IllegalArgumentException();
        String s = getPath();
        List<String> elements = new ArrayList<>();
        if (s.startsWith("/"))elements.add(s);
        elseelements.add("/");
        while (s.contains(FilePath.SEPATATOR)) {
            elements.add(s.substring(0, s.lastIndexOf(FilePath.SEPATATOR)));
            s = s.substring(0, s.lastIndexOf(FilePath.SEPATATOR));
        }
        if (s.length() > 0)elements.add(s);
        return elements.toString();
    }
}