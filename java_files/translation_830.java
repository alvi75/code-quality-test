import java.util.*;

public class Translation830 {
    public EscherGraphics(HSSFShapeGroup escherGroup, HSSFWorkbook workbook,Color forecolor, float verticalPointsPerPixel) {
    this(escherGroup, verticalPointsPerPixel);
    setFont(new Font("Arial", Font.PLAIN, 10 * verticalPointsPerPixel));
    setForeground(forecolor);
}
}