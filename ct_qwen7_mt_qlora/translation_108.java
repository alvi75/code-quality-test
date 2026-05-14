import java.util.*;

public class Translation108 {
    1 public HSSFColor getColor(short index) {
    2 if (index == HSSFColor.AUTOMATIC.getIndex())3 return HSSFColor.AUTOMATIC;
    4 else5 {
        6 byte[] b = palette.getColor(index);
        7 if (b != null)8 {
            9 return new CustomColor(index, b);
            10 }
            11 }
            12 return null;
        }
}