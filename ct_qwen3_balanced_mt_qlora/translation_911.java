import java.util.*;

public class Translation911 {
    ublic String toString() {
    StringBuilder sb = new StringBuilder(64);
    sb.append(getClass().getName()).append(" [");
    sb.append("sid=0x").append(HexDump.shortToHex(getSid())).append(" [").append("]\n");
    sb.append("];
    \n");
    return sb.toString();
}
}