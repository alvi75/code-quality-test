import java.util.*;

public class Translation108 {
    public Color getColor(int index) {
    if (index == AUTOMATIC.getIndex()) return AUTOMATIC;
    int colorIndex = getPaletteIndex(index);
    if (colorIndex < 0 || colorIndex >= palette.size()) return null;
    byte[] b = palette.get(colorIndex);
    if (b == null) return null;
    return new CustomColor(index, b);
}
}