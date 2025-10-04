import java.util.*;

public class Translation108 {
    public HSSFColor getColor(short index) {
    if (index == HSSFColor.AUTO_INDEX) {
        return AUTO_COLOR;
    }
    else {
        byte[] b = _palette.getColor(index);
        if (b == null) {
            return null;
        }
        else {
            return new CustomColor(index, b);
        }
    }
}
}