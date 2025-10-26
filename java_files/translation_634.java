import java.util.*;

public class Translation634 {
    ublic static TagOpt fromOption(String o) {
    if (o == null || o.length() == 0) {
        return AUTO_FOLLOW;
    }
    for (TagOpt opt : values()) {
        if (opt.option().equals(o)) {
            return opt;
        }
    }
    throw new IllegalArgumentException(MessageFormat.format(JGitText.get().invalidTagOption, o));
}
}