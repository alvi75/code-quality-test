import java.util.*;

public class Translation830 {
    ublic EscherGraphics(EShapeGroup escherGroup, HSSFWorkbook workbook, Color forecolor, float verticalPointsPerPixel) {
    this.escherGroup = escherGroup;
    this.workbook = workbook;
    this.verticalPointsPerPixel = verticalPointsPerPixel;
    this.verticalPixelsPerPoint = 1 / verticalPointsPerPixel;
    this.font = new Font("Arial", 10);
    this.foreground = forecolor;
}
}