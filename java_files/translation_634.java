import java.util.*;

public class Translation634 {
    public static TagCommand fromOptions(Repository repo) {
    final List<String> tags = new ArrayList<>();
    for (String o : repo.getConfig().getTags()) {
        if (o.startsWith(Constants.OBJECT_ID_STRING_PREFIX))add(repo, o);
    }
}