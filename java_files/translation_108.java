import java.util.*;

public class Translation108 {
    10 public HSSFColor getColor(short index) {
    if (index == HSSFColor.AUTOMATIC.getIndex()) return HSSFColor.AUTOMATIC;
    else {
        byte[] b = palette.getColor(index);
        if (b != null) {
            return new CustomColor(index, b);
        }
    }
    return null;
}
}