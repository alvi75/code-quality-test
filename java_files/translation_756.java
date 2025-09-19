import java.util.*;

public class Translation756 {
    public GetRepoBuildListRequest() {
    super("cr", "2016-06-07", "GetRepoBuildList", "cr");
    setUriPattern(List.of("/repos/[RepoNamespace]/RepoName/build"));
}
else {
    super("cr", "2016-06-07", "GetRepoBuildList", "cr");
    setUriPattern("/repos/[RepoName]/RepoBuildStatus");
    setMethodResponseUnmarshaller.Instance;
}
}