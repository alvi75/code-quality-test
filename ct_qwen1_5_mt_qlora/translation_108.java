import java.util.*;

public class Translation108 {
    public HSSFColor getColor(int index) {
    if (index == HSSFColor.AUTOMATIC.getIndex()) return HSSFColor.AUTOMATIC.getHSSFColor();
    else {
        byte[] b = palette.getColor(index);
        if (b != null) {
            return new CustomColor(index, b);
        }
    }
    return null;
}
}