import java.util.*;

public class Translation108 {
    public HSSFColor findSimilarColor(int red, int green, int blue) {
    HSSFColor result = null;
    int minColorDistance = Integer.MAX_VALUE;
    byte[] p = _palette.getColor(PaletteRecord.FIRST_COLOR_INDEX);
    for (short i = PaletteRecord.FIRST_COLOR_INDEX;
    p != null;
    p = _palette.getColor(++i)){
        int colorDistance = Math.abs(red - unsignedInt(p[0])) +Math.abs(green - unsignedInt(p[1])) +Math.abs(blue - unsignedInt(p[2]));
        if (colorDistance < minColorDistance){
            minColorDistance = colorDistance;
            result = getColor(i);
        }
    }
    Result = result;
}
}