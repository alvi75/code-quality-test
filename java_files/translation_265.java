import java.util.*;

public class Translationtranslation_265 {
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName()).append(" [ARRAY]\n");
        sb.append(" size = ").append(size()).append("\n");
        sb.append(" array id = ").append(Integer.toHexString(arrayId)).append("\n");
        if (isFormula()) {
            sb.append(" [").append(getFormula()).append("]\n");
        }
        else {
            sb.append(" format = ").append(HexDump.shortToHex(format)).append("\n");
            sb.append(" count = ").append(HexDump.intToHex(count)).append("\n");
            sb.append(" array size = ").append(HexDump.intToHex(arraySize)).append("\n");
        }
        sb.append("[/").append(getClass().getName()).append("]\n");
        return sb.toString();
    }
}