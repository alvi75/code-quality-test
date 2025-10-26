import java.util.*;

public class Translation103 {
    ublic CreateDistributionWithTagsResponse CreateDistributionWithTags(CreateDistributionWithTagsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CreateDistributionWithTagsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreateDistributionWithTagsResponseUnmarshaller.Instance;
    return Invoke<CreateDistributionWithTagsResponse>(request, options);
}
}