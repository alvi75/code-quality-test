import java.util.*;

public class Generated_6367667d1a6d9265ec017401 {
    public static String unescapeJava(String str) throws Exception {
        if (str == null) {
            return null;
        }
        StringBuffer sb = new StringBuffer();
        int i = 0;
        while (i < str.length()) {
            char c = str.charAt(i);
            if (c == '\\') {
                if (i + 1 < str.length()) {
                    char c1 = str.charAt(i + 1);
                    if (c1 == '\\') {
                        sb.append('\\');
                        i += 2;
                    } else if (c1 == 'n') {
                        sb.append('\n');
                        i += 2;
                    } else if (c1 == 'r') {
                        sb.append('\r');
                        i += 2;
                    } else if (c1 == 't') {
                        sb.append('\t');
                        i += 2;
                    } else if (c1 == 'f') {
                        sb.append('\f');
                        i += 2;
                    } else if (c1 == 'b') {
                        sb.append('\b');
                        i += 2;
                    } else if (c1 == '\"') {
                        sb.append('\"');
                        i += 2;
                    } else if (c1 == '\'') {
                        sb.append('\'');
                        i += 2;
                    } else if (c1 == '\\') {
                        sb.append('\\');
                        i += 2;
                    } else if (c1 == 'u') {
                        if (i + 5 < str.length()) {
                            String hex = str.substring(i + 2, i + 6);
                            int code = Integer.parseInt(hex, 16);
                            sb.append((char) code);
                            i += 6;
                        } else {
                            throw new Exception("Invalid escape sequence: " + str);
                        }
                    } else {
                        throw new Exception("Invalid
}