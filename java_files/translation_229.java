import java.util.*;

public class Translation229 {
    public int getGB2312Id(String ofString) {
    char[] str = ofString.toCharArray();
    int len = str.length;
    if (len < 2) {
        return -1;
    }
    int b0 = (str[0] & 0x0FF) - 161;
    int b1 = (str[1] & 0x0FF) - 161;
    return (b0 << 9) | b1;
}
}