import java.util.*;

public class Translationtranslation_108 {
    public HSSFColor getColor(int index) {
        if(index == -1) return getAutomaticColor(index);
        int ncolors = _palette.getColorCount();
        if (ncolors < 0 || index > ncolors) {
            return null;
        }
        return _palette.getColor(index);
    }
}