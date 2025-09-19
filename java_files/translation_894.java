import java.util.*;

public class Translation894 {
    public void clearFormatting() {
    if (hasFormatting()) {
        HSSFRichTextString s = new HSSFRichTextString(getString());
        HSSFFont hssfFont = matchExact(font.getFontName(), font.getStyle(), font.getSuperSubScript(), font.getColorIndex());
        s.applyFont(hssfFont);
        setString(s);
    }
}
}