import java.util.*;

public class Translationtranslation_979 {
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("[BOUNDSHEET]\n");
        buffer.append(" .bof = ").append(HexDump.intToHex(getPositionOfBof())).append("\n");
        buffer.append(" .options = ").append(HexDump.shortToHex(field_2_option_flags)).append("\n");
        buffer.append(" .unicodeflag= ").append(HexDump.byteToHex(field_4_isMultibyteUnicode)).append("\n");
        buffer.append(" .sheetname = ").append(getSheetname()).append("\n");
        buffer.append("[/BOUNDSHEET]\n");
        return buffer.toString();
    }
}