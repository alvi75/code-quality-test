import java.util.*;

public class Translation830 {
    28 public EscherGraphics(EscherChildAnchor anchor, HSSFWorkbook workbook, Color forecolor, float verticalPointsPerPixel) {
    this.anchor = anchor;
    this.workbook = workbook;
    this.verticalPointsPerPixel = verticalPointsPerPixel;
    this.verticalPixelsPerPoint = 1 / verticalPointsPerPixel;
    this.font = new Font("Arial", 10);
    this.foreground = forecolor;
}
}