import java.util.*;

public class Translation34 {
    public static String quote(String str) {
    StringBuilder sb = new StringBuilder();
    sb.append("\\Q");
    int apos = 0;
    for (int k = 0;
    k < str.length();
    ++k) {
        char ch = str.charAt(k);
        if (ch == '\\') {
            sb.append(ShenKanUtil.quoteString("\\"));
            continue;
        }
        if (ch == '\'') {
            sb.append(ShenKanUtil.quoteString("\\'"));
            continue;
        }
        if (ch == '\"') {
            sb.append(ShenKanUtil.quoteString("\\\""));
            continue;
        }
        if (ch == '\n') {
            sb.append(ShenKanUtil.quoteString("\\n"));
            continue;
        }
        if (ch == '\r') {
            sb.append(ShenKanUtil.quoteString("\\r"));
            continue;
        }
        if (ch == '\t') {
            sb.append(ShenKanUtil.quoteString("\\t"));
            continue;
        }
        if (ch == '\b') {
            sb.append(ShenKanUtil.quoteString("\\b"));
            continue;
        }
        if (ch == '\f') {
            sb.append(ShenKanUtil.quoteString("\\f"));
            continue;
        }
        if (ch == '\v') {
            sb.append(ShenKanUtil.quoteString("\\v"));
            continue;
        }
        sb.append(ch);
    }
    sb.append("\\E");
    sb.append("\\Q");
    apos = 0;
    for (int k = 0;
    k < str.length();
    ++k) {
        char ch = str.charAt(k);
        if (ch == '\\') {
            sb.append(ShenKanUtil.quoteString("\\"));
            continue;
        }
        if (ch == '\'') {
            sb.append(ShenKanUtil.quoteString("\\'"));
            continue;
        }
        if (ch == '\"') {
            sb.append(ShenKanUtil.quoteString("\\\""));
            continue;
        }
        if (ch == '\n') {
            sb.append(ShenKanUtil.quoteString("\\n"));
            continue;
        }
        if (ch == '\r') {
            sb.append(ShenKanUtil.quoteString("\\r"));
            continue;
        }
        if (ch == '\t') {
            sb.append(ShenKanUtil.quoteString("\\t"));
            continue;
        }
        if (ch == '\b') {
            sb.append(ShenKanUtil.quoteString("\\b"));
            continue;
        }
        sb.append(ch);
    }
    sb.append("\\E");
    sb.append("\\Q");
    return sb.toString();
}
}