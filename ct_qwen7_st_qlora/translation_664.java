import java.util.*;

public class Translation664 {
    public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("[SXVDEX]\n");
    sb.append(" .grbit1 = ").append(Integer.toHexString(getGrbit1())).append("\n");
    sb.append(" .grbit2 = ").append(Integer.toHexString(getGrbit2())).append("\n");
    sb.append(" .citmShow = ").append(Integer.toHexString(getCitmShow())).append("\n");
    sb.append(" .isxdiSort = ").append(Integer.toHexString(getIsxdiSort())).append("\n");
    sb.append(" .isxdiShow = ").append(Integer.toHexString(getIsxdiShow())).append("\n");
    sb.append(" .subName = ").append(getSubName()).append("\n");
    sb.append("[/SXVDEX]\n");
    return sb.toString();
}
}