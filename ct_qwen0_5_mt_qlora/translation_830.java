import java.util.*;

public class Translation830 {
    public EscherGraphics(HSSFShapeGroup escherGroup, HSSFWorkbook workbook, Color forecolor, float verticalPointsPerPixel) {
    this.escherGroup = escherGroup;
    this.workbook = workbook;
    this.verticalPointsPerPixel = verticalPointsPerPixel;
    this.verticalPixelsPerPoint = 1f / verticalPointsPerPixel;
    this.font = new Font(FontFamily.SERIF, 10);
    this.foreground = forecolor;
}
}