import java.util.*;

public class Translationtranslation_108 {
    public HSSFColor getColor(short index) {
        if (index == AUTOMATON.COLOR_INDEX) {
            return AUTOMATON.getColor();
        }
        for (short i = 0;
        i < _colors.size();
        i++) {
            HSSFColor c = _colors.get(i);
            if (c.getRGB() == index) {
                return c;
            }
        }
        return null;
    }
}