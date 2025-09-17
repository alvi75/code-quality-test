import java.util.*;

public class Translationtranslation_77 {
    public String getHumanishName() {
        if (path.isEmpty() || path.get().equals("."))throw new IllegalArgumentException(JGitText.get().emptyPathNotPermitted);
        String s = getPath();
        String[] elements = s.split("/");
        if (elements.length == 0)throw new IllegalArgumentException(JGitText.get().emptyPathNotPermitted);
        String result = elements[elements.length-1];
        if (Constants.DOT_GIT.equalsIgnoreCase(result))result = elements[elements.length-2];
        else if (result.endsWith(Constants.DOT_GIT_EXT))result = result.substring(0, result.length()-Constants.DOT_GIT_EXT.length());
        return result;
    }
}