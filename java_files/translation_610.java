import java.util.*;

public class Translationtranslation_610 {
    public RuleTagToken(String ruleName, int bypassTokenType, String label) {
        if (ruleName == null || ruleName.isEmpty()) {
            throw new IllegalArgumentException("ruleName cannot be null or empty");
        }
        this.ruleName = ruleName;
        this.bypassTokenType = bypassTokenType;
        this.label = label;
    }
    }
}