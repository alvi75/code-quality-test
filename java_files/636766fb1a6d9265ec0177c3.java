import java.util.*;

public class Generated_636766fb1a6d9265ec0177c3 {
    public static boolean isAscii(final char ch) {
        if (ch >= 'a' && ch <= 'z') {
            return true;
        } else if (ch >= 'A' && ch <= 'Z') {
            return true;
        } else if (ch >= '0' && ch <= '9') {
            return true;
        } else if (ch == ' ') {
            return true;
        } else if (ch == '!' || ch == '#' || ch == '$' || ch == '%' || ch == '&' || ch == '*' ||
                ch == '?' || ch == '(' || ch == ')' || ch == '[' || ch == '{' || ch == ']' ||
                ch == ';' || ch == ':' || ch == '"' || ch == '\'' || ch == '<' || ch == '>' ||
                ch == ',' || ch == '.' || ch == '/' || ch == '?' || ch == '~' || ch == '_' || ch == '|' ||
                ch == '\\' || ch == '\n' || ch == '\r' || ch == '\t' || ch == '\f' || ch == '\b' || ch == '\v') {
            return true;
        }
        return false;
    }
}