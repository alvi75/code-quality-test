import java.util.*;

public class Translation610 {
    ublic RuleTagToken(String ruleName, int bypassTokenType, String label) {
    if (StringUtils.isBlank(ruleName)) {
        throw new IllegalArgumentException("ruleName cannot be null or empty.");
    }
    this.ruleName = ruleName;
    this.bypassTokenType = bypassTokenType;
    this.label = label;
}
}