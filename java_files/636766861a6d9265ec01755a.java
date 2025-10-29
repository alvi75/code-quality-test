import java.util.*;

public class Generated_636766861a6d9265ec01755a {
    public final MatchResult match(CharSequence uri) {
        if (uri == null || uri.length() == 0) {
            return null;
        }
        int len = uri.length();
        if (len < pattern.length()) {
            return null;
        }

        int i = 0;
        for (; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (c == ':') {
                break;
            } else if (c != uri.charAt(i)) {
                return null;
            }
        }

        if (i == pattern.length()) {
            return new MatchResult(uri, new String[0], new Object[0]);
        }

        int j = i + 1;
        StringBuilder sb = new StringBuilder();
        while (j < len && uri.charAt(j) != '/') {
            sb.append(uri.charAt(j));
            j++;
        }

        String name = sb.toString();
        if (name.isEmpty()) {
            return null;
        }

        String[] names = new String[pattern.length()];
        Object[] values = new Object[pattern.length()];
        names[i] = name;

        for (int k = i + 1; k < pattern.length(); k++) {
            if (pattern.charAt(k) == ':') {
                break;
            }
            names[k] = pattern.substring(k, k + 1);
        }

        for (int k = i + 1; k < pattern.length(); k++) {
            if (names[k] == null) {
                break;
            }
            values[k] = uri.subSequence(j, j + Integer.parseInt(names[k]));
            j += Integer.parseInt(names[k]);
        }

        return new MatchResult(uri, names, values);
    }
}