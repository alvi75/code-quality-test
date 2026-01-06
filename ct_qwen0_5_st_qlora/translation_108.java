import java.util.*;

public class Translation108 {
    public HSSFColor getColor(int index) {
    if (index == AUTOMATIC.getIndex())return AUTOMATIC.getColor();
    final byte[] b = palette.getColor(index);
    if (b != null) {
        return new CustomColor(index, b);
    }
    return null;
}
}