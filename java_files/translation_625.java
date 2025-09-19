import java.util.*;

public class Translation625 {
    ublic DescribeClusterUserKubeconfigRequest() {
    super("cr", "2016-06-07", "DescribeClusterUserKubeconfig", "cr");
    setUriPattern("/k8s/[ClusterId]/user_config");
    setMethod(MethodType.GET);
}
}