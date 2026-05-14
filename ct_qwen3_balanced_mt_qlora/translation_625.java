import java.util.*;

public class Translation625 {
    ublic DescribeClusterUserKubeconfigRequest() {
    super("cr", "2016-06-07", "DescribeClusterUserKubeconfig", "cr");
    setUriPattern("/repos/[RepoNamespace]/[RepoName]/clusters/[ClusterId]/user_config");
    setMethod(MethodType.GET);
}
}