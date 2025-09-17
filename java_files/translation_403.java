import java.util.*;

public class Translationtranslation_403 {
    public String toString() {
        final StringBuilder buffer = new StringBuilder();
        buffer.append("[MMS]\MMSTEXT]\n");
        buffer.append(" .numfonts =").append(field_1_numfonts).append('\n');
        for (int k = 0;
        k < field_2_font_names.length;
        k++) {
            buffer.append(" .font_").append(k).append(" = ").append(field_2_font_names[k]).append('\n');
        }
        buffer.append("[/MMS]\MMSTEXT]\n");
        return buffer.toString();
    }
}