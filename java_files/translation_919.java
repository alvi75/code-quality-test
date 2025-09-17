import java.util.*;

public class Translationtranslation_919 {
    public void setConnectionTimeout(int millis) {
        if (millis < 0)throw new IllegalArgumentException(JGitText.get().connectionTimeoutMustBeNonNegative);
        connectionTimeoutInMilliseconds = millis;
    }
}