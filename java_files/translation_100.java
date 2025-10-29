import java.util.*;

public class Translation100 {
    ublic DescribeRepositoriesResponse DescribeRepositories(DescribeRepositoriesRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeRepositoriesRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeRepositoriesResponseUnmarshaller.Instance;
    return Invoke<DescribeRepositoriesResponse>(request, options);
}
}