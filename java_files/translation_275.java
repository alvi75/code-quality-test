import java.util.*;

public class Translation275 {
    ublic DescribeCodeRepositoryResponse DescribeCodeRepository(DescribeCodeRepositoryRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeCodeRepositoryRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeCodeRepositoryResponseUnmarshaller.Instance;
    return Invoke<DescribeCodeRepositoryResponse>(request, options);
}
}