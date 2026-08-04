import java.util.*;

public class Generated_6367667d1a6d9265ec017401 {
    public static String unescapeJava(String str) throws Exception {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            char c = str.charAt(i);
            if (c == '\\') {
                if (i + 1 < str.length()) {
                    char next = str.charAt(i + 1);
                    if (next == '\\') {
                        sb.append(c);
                        i += 2;
                    } else if (next == 'n') {
                        sb.append('\n');
                        i += 2;
                    } else if (next == 'r') {
                        sb.append('\r');
                        i += 2;
                    } else if (next == 't') {
                        sb.append('\t');
                        i += 2;
                    } else if (next == 'b') {
                        sb.append('\b');
                        i += 2;
                    } else if (next == 'f') {
                        sb.append('\f');
                        i += 2;
                    } else if (next == 'u') {
                        if (i + 5 < str.length()) {
                            String hex = str.substring(i + 2, i + 6);
                            sb.append((char) Integer.parseInt(hex, 16));
                            i += 6;
                        } else {
                            throw new Exception("Invalid escape sequence: " + str);
                        }
                    } else {
                        sb.append(c);
                        i += 2;
                    }
                } else {
                    sb.append(c);
                    i++;
                }
            } else {
                sb.append(c);
                i++;
            }
        }
        return sb.toString();
    }
}