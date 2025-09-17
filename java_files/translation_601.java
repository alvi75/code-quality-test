import java.util.*;

public class Translationtranslation_601 {
    public static int getEncodedSize(int numberOfRanges) {
        return 2 + CellRangeAddress.getEncodedSize(numberOfRanges);
    }
}