import java.util.*;

public class Translationtranslation_830 {
    public EscherGraphics( HSSFShapeGroup escherGroup, HSSFWorkbook workbook,Color forecolor, double verticalPointsPerPixel ){
        this(escherGroup, workbook, forecolor, (int)verticalPointsPerPixel, (int)verticalPointsPerPixel );
        setHorizontalAlignment(HORIZONTAL_ALIGNMENT_LEFT);
        setVerticalAlignment(VERTICAL_ALIGNMENT_TOP);
        setFont(forecolor, verticalPointsPerPixel, horizontalPointsPerPixel);
    }
}