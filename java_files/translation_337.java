import java.util.*;

public class Translationtranslation_337 {
    public String getNameText(final int index) {
        final NameRecord name = getNameRecord(index);
        if (name == null) {
            return "";
        }
        return name.getNameText();
    }
}