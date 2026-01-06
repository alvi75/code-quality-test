import java.util.*;

public class Translation634 {
    public static TagOpt fromOption(String o) {
    for (TagOpt opt : values()) {
        if (opt.option().equals(o)) {
            return opt;
        }
    }
    throw new IllegalArgumentException(MessageFormat.format(JGitText.get(), "invalidTagOption", o));
}
}