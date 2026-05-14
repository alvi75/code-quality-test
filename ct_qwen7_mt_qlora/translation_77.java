import java.util.*;

public class Translation77 {
    1 public String getHumanishName() {
    2 if (getPath().isEmpty() || getPath() == null) {
        3 throw new IllegalArgumentException();
        4 }
        5 final String s = getPath();
        6 final String[] elements;
        7 if ("file".equals(getScheme()) || LOCAL_FILE.matcher(s).matches()) {
            8 elements = s.split("[\\\\/]+");
            9 }
            else {
                10 elements = s.split("/");
                11 }
                12 if (elements.length == 0) {
                    13 throw new IllegalArgumentException();
                    14 }
                    15 String result = elements[elements.length - 1];
                    16 if (Constants.DOT_GIT.equals(result)) {
                        17 result = elements[elements.length - 2];
                        18 }
                        else {
                            19 if (result.endsWith(Constants.DOT_GIT_EXT)) {
                                20 result = result.substring(0, result.length() - Constants.DOT_GIT_EXT.length());
                                21 }
                                22 }
                                23 return result;
                            }
}