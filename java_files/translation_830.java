import java.util.*;

public class Translation830 {
    public EscherGraphics(HSSFShapeGroup escherGroup, HSSFWorkbook workbook, Color forecolor, double verticalPointsPerPixel) {
    this(escherGroup,workbook,forecolor,(int)(verticalPointsPerPixel*256));
    this.verticalPointsPerPixel = verticalPointsPerPixel;
}
}