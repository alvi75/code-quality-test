import java.util.*;

public class Translation130 {
    ublic ScaleClusterRequest(){
    BaseUri = new Uri(UrlFormatter.FormatUrlWithKeyId("cs", "2015-12-15", "clusters", clusterId));
    UriPattern = "/clusters/{
        ClusterId}
        ";
        Method = MethodType.PUT;
    }
}