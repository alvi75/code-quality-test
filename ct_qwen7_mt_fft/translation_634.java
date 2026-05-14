import java.util.*;

public class Translation634 {
    public static TagOpt fromString(String o) {
    if (o == null || o.length() == 0)return AUTO_FOLLOW;
    for (TagOpt tagopt : values())if (tagopt.option.equals(o))return tagopt;
    throw new IllegalArgumentException(MessageFormat.format(JGitText.get().invalidTagOption, o));
}
}