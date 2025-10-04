import java.util.*;

public class Translation625 {
    public DescribeClusterUserKubeconfigRequest() {
    super("cr", "2016-06-07", "DescribeClusterUserKubeconfig", "cr");
    setUriPattern("/repos/[RepoNamespace]/[RepoName]/users/[UserId]/kubeconfig");
    setMethod(MethodType.GET);
}
}