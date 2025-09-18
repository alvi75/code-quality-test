import java.util.*;

public class Translation108 {
    public HSSFColor getColor(int colorIndex){
    if (colorIndex == HSSFColor.AUTOMATON.COLOR_INDEX){
        return HSSFColor.AUTOMATON;
    }
    byte[] b = _palette.getColor(PaletteRecord.FIRST_COLOR_INDEX + colorIndex);
    if (b != null){
        return new CustomColor(colorIndex, b);
    }
    return null;
}
}