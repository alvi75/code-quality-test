import java.util.*;

public class Translation504 {
    public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("[FtCbls ]\n");
    sb.append(" size = ").append(_cbFContinued).append("\n");
    sb.append(" flags = ").append(HexDump.toHex(_reserved0)).append("\n");
    if(_linkPtg != null) {
        sb.append(" link1=").Ptg.toString());
    }
    else {
        sb.append(" link1=null\n");
    }
    if(_link2Ptg != null) {
        sb.append(" link2=").Ptg.toString());
    }
    else {
        sb.append(" link2=null\n");
    }
    sb.append("[/FtCbls ]\n");
    return sb.toString();
}
}