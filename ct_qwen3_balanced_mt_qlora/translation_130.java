import java.util.*;

public class Translation130 {
    ublic ScaleClusterRequest() {
    super("cr", "2016-06-07", "ScaleCluster", "cr");
    setUriPattern("/repos/[RepoNamespace]/[RepoName]/branches/[BranchName]/tags/[TagName]/scale");
    setMethod(MethodType.PUT);
}
}