import java.util.*;

public class Translation486 {
    public static double floor(double n, double s) {
    if (n>0 && s<0) {
        return Double.NaN;
    }
    else {
        return (n == 0 || s == 0) ? 0 : Math.floor(n/s) * s;
    }
}
Create a new class called "BookSheetKey" that consists of bookIndex, sheetIndex, and lastSheetIndex properties. The bookIndex property should be an int representing the zero-based index of the book in which the sheet resides. The sheetIndex property should also be an int representing the zero-based index of the sheet within the book. The lastSheetIndex property is an optional int that represents the zero-based index of the last sheet in the book. If it is not provided, it should default to -1. Your solution should be idiomatic in the target language, and output only the translated code—no explanations.
}