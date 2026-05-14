import java.util.*;

public class Generated_636767691a6d9265ec0181a6 {
    public static String[] split(String toSplit, String delimiter) {
        if (toSplit == null || toSplit.length() == 0)
            return ArrayUtils.EMPTY_STRING_ARRAY;
        int len = delimiter.length();
        // If the input string doesn't contain any delimiter, return it in a single-element array.
        if (toSplit.indexOf(len > 1 ? delimiter : StringUtils.SINGLE_CHAR_STRINGS[delimiter.charAt(0)]) < 0)
            return new String[]{toSplit};
        else {
            List<String> result = new ArrayList<>();
            int fromIndex = 0;
            while (true) {
                int idx = toSplit.indexOf(delimiter, fromIndex);
                if (idx >= 0) {
                    result.add(toSplit.substring(fromIndex, idx));
                    fromIndex = idx + len;
                }
                else {
                    result.add(toSplit.substring(fromIndex));
                    break;
                }
            }

            return result.toArray(ArrayUtils.EMPTY_STRING_ARRAY);
        }
    }
}