import java.util.*;

public class Translation830 {
    public EscherGraphics(HSSFShapeGroup escherGroup,HSSFWorkbook workbook,Color foreground,float verticalPointsPerPixel) {
    this.escherGroup = escherGroup;
    this.workbook = workbook;
    this.verticalPointsPerPixel = verticalPointsPerPixel;
    this.verticalPixelsPerPoint = 1/verticalPointsPerPixel;
    font = new Font("Arial", 10);
    this.foreground = foreground;
}
}