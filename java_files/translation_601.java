import java.util.*;

public class Translation601 {
    public static int getEncodedSize(int numberOfRanges) {
    return 2 + CellRangeAddress.getEncodedSize(numberOfRanges);
}
}