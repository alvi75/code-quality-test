import java.util.*;

public class Translation911 {
    ublic override String toString() {
    StringBuilder sb = new StringBuilder(64);
    sb.Append(GetType().Name).Append(" [");
    sb.Append("sid=").Append(HexDump.ShortToHex(_sid));
    sb.Append(" size=").Append(_data.length);
    sb.Append(" : ").Append(HexDump.toHex(_data));
    sb.Append("]\n");
    return sb.toString();
}
}