import java.util.*;

public class Translationtranslation_420 {
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("[FEATURE HEADER]\n");
        buffer.append(" .header = ").append(getText()).append("\n");
        buffer.append("[/FEATURE HEADER]\n");
        return buffer.toString();
    }
}