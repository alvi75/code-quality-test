import java.util.*;

public class Translation830 {
    public EscherGraphics(HSSFShapeGroup escherGroup, HSSFWorkbook workbook, HSSFColor foreground, double verticalPointsPerPixel) {
    this(escherGroup, workbook);
    this.verticalPointsPerPixel = verticalPointsPerPixel;
    this.verticalPixelsPerPoint = 1.0 / verticalPointsPerPixel;
    this.foregroundColor = foreground;
}
}