import java.util.*;

public class Translation651 {
    ublic DescribeMountTargetSecurityGroupsResponse DescribeMountTargetSecurityGroups(DescribeMountTargetSecurityGroupsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeMountTargetSecurityGroupsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeMountTargetSecurityGroupsResponseUnmarshaller.Instance;
    return Invoke<DescribeMountTargetSecurityGroupsResponse>(request, options);
}
}