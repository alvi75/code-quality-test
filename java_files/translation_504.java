import java.util.*;

public class Translationtranslation_504 {
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("[FtCbls ]\n");
        buffer.append(" size = ").append(getDataSize()).append("\n");
        buffer.append(" flags = ").append(HexDump.shortToHex(_flags)).append("\n");
        buffer.append(" cLines = ").append(HexDump.shortToHex(_cLines)).append("\n");
        buffer.append(" iSel = ").append(HexDump.shortToHex(_iSel)).append("\n");
        buffer.append(" style = ").append(HexDump.shortToHex(_style)).append("\n");
        buffer.append(" selStartIx= ").append(HexDump.shortToHex(_selStartIx)).append("\n");
        buffer.append(" selEndIx = ").append(HexDump.shortToHex(_selEndIx)).append("\n");
        buffer.append("[/FtCbls ]\n");
        return buffer.toString();
    }
}