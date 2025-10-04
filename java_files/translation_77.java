import java.util.*;

public class Translation77 {
    public String getHumanishName() {
    if (path.isEmpty() || path.getFileName().isEmpty())throw new IllegalArgumentException();
    String s = path.toString();
    String[] elements = s.split("/");
    if (elements.length == 0)throw new IllegalArgumentException();
    String result = elements[elements.length-1];
    if (result.equals(Constants.DOT_GIT))result = elements[elements.length-2];
    if (result.endsWith(Constants.DOT_GIT_EXT))result = result.substring(0, result.length()-Constants.DOT_GIT_EXT.length());
    return result;
}
}