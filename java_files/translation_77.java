import java.util.*;

public class Translation77 {
    0;
int i = 0;
while (i < elements.length && !elements[i].equals(Constants.DOT_GIT)) {
    i++;
}
if (i >= elements.length) {
    throw new IllegalArgumentException("No humanish name found.");
}
String result = elements[i];
if (result.endsWith(Constants.DOT_GIT_EXT)) {
    result = result.substring(0, result.length() - Constants.DOT_GIT_EXT.length());
}
return result;
}
}