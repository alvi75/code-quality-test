import java.util.*;

public class Translation108 {
    public HSSFColor getColor(short index) {
    if (index == AUTOMATIC_INDEX)return getCustomColor(AUTOMATIC_INDEX);
    else {
        final byte[] b = palette.getColor(index);
        if (b != null) {
            return new CustomColor(index, b);
        }
    }
    return null;
}
}