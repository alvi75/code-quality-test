import java.util.*;

public class Translation108 {
    public HSSFColor getColor(short index) {
    if (index == HSSFColor.AUTOMATIC.getIndex()) return getAutomaticColor();
    else {
        byte[] b = _palette.getColor(index);
        if (b != null) {
            return new CustomColor(index, b);
        }
    }
    return null;
}
}