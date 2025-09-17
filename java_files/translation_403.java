import java.util.*;

public class Translationtranslation_403 {
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("[MMS]\n");
        buffer.append(" .addMenu = ").append(Integer.toHexString(getAddMenu())).append("\n");
        buffer.append(" .delMenu = ").append(Integer.toHexString(getDelMenu())).append("\n");
        buffer.append("[/MMS]\n");
        return buffer.toString();
    }
}