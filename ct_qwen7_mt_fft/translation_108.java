import java.util.*;

public class Translation108 {
    public HSSFColor getColor(short index) {
    if (index == HSSFColor.AUTOMATIC.getIndex()) {
        return HSSFColor.AUTOMATIC;
    }
    for (short i=0;
    i<colors.size();
    i++) {
        HSSFColor c = colors.get(i);
        if (c.getIndex() == index) {
            return c;
        }
    }
    return null;
}
}