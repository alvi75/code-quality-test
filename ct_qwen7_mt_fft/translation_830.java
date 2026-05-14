import java.util.*;

public class Translation830 {
    public EscherGraphics( HSSFSimpleShape shape, HSSFWorkbook workbook, int foregroundColor,int backgroundColour, float verticalPointsPerPixel ){
    this.shape = shape;
    this.workbook = workbook;
    this.foregroundColor = foregroundColor;
    this.backgroundColour = backgroundColour;
    this.verticalPointsPerPixel = verticalPointsPerPixel;
    this.verticalPixelsPerPoint = 1/verticalPointsPerPixel;
}
}