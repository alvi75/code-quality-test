import java.util.*;

public class Translationtranslation_108 {
    public HSSFColor getColor(short index) {
        if (index == HSSFColor.AUTOMATIC.getIndex()) {
            return HSSFColor.AUTOMATIC;
        }
        byte[] b = _palette.getColor(index);
        if (b == null) {
            return null;
        }
        return new CustomColor(index, b);
    }
}