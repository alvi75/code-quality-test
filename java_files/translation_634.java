import java.util.*;

public class Translationtranslation_634 {
    public static TagOpt fromOption(String o) {
        for (TagOpt to : values()) {
            if (to.option.equalsIgnoreCase(o)) {
                return to;
            }
        }
        throw new IllegalArgumentException(MessageFormat.format(JGitText.get().invalidTagOption, o));
    }
}