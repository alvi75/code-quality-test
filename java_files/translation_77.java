import java.util.*;

public class Translation77 {
    public String getHumanishName() throws IllegalArgumentException {
    if (getPath().isEmpty() || getPath() == null)throw new IllegalArgumentException();
    String s = getPath();
    String[] elements;
    if (scheme.equalsIgnoreCase("file") || LOCAL_FILE.matcher(s).matches()) {
        elements = s.split("\\\\" + File.separatorChar + "/");
    }
    else {
        elements = s.split(File.separator);
    }
    if (elements.length == 0)throw new IllegalArgumentException();
    String result = elements[elements.length-1];
    if (Constants.DOT_GIT.equals(result))result = elements[elements.length-2];
    else if (result.endsWith(".git"))result = result.substring(0,result.length()-4);
    return result;
}
}