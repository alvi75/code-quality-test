import java.util.*;

public class Translation108 {
    ublic HSSFColor getColor(short index) {
    if (index == HSSFColor.AUTOMATIC.index)return HSSFColor.AUTOMATIC.getInstance();
    else {
        byte[] b = palette.getColor(index);
        if (b != null) {
            return new CustomColor(index, b);
        }
    }
    return null;
}
}