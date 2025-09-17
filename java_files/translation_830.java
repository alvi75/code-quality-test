import java.util.*;

public class Translationtranslation_830 {
    public EscherGraphics(HSSFShapeGroup escherGroup, HSSFWorkbook workbook,Color foreground, float verticalPointsPerPixel) {
        this(escherGroup, verticalPointsPerPixel);
        setFont(new Font("Arial", Font.PLAIN, 10 * verticalPointsPerPixel));
        setForeground(foreground);
        setBackground(workbook.getWhite());
    }
}