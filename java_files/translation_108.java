import java.util.*;

public class Translation108 {
    0) {
    return HSSFColor.Automatic.getInstance();
}
byte[] b = palette.getColor(index);
if (b != null) {
    return new CustomColor(index, b);
}
return null;
}
}