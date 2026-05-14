import java.util.*;

public class Translation634 {
    1 public static TagOpt fromOption(String o) {
    2 if (o == null || o.length() == 0)3 return AUTO_FOLLOW;
    4 for (TagOpt tagopt : values())5 if (tagopt.option.equals(o))6 return tagopt;
    7 throw new IllegalArgumentException(MessageFormat.format(JGitText.get().invalidTagOption, o));
}
}