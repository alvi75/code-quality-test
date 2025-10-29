import java.util.*;

public class Translation213 {
    ublic DescribeByoipCidrsResponse DescribeByoipCidrs(DescribeByoipCidrsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeByoipCidrsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeByoipCidrsResponseUnmarshaller.Instance;
    return Invoke<DescribeByoipCidrsResponse>(request, options);
}
}