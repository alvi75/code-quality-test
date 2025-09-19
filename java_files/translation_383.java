import java.util.*;

public class Translation383 {
    public GetRepoBuildRuleListRequest() {
    super("cr", "2016-06-07", "GetRepoBuildRuleList", "cr");
    setUriPattern(List.of("/repos/[RepoNamespace]/RuleList"));
}
else {
    super("cr", "2016-06-07", "GetRepoBuildRuleList", "cr", "openAPI");
    setUriPattern("/repos/[RepoName]/rules");
    setMethodRules(true);
}
}
}