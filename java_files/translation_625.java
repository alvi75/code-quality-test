import java.util.*;

public class Translation625 {
    ublic DescribeClusterUserKubeconfigRequest() {
    Object uriPattern = Pattern.compile("/k8s/[ClusterId]/user_config").matcher(this._pathTemplate);
    if (uriPattern.matches())this._method = MethodType.GET;
}
}