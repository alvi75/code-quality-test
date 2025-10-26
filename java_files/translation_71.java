import java.util.*;

public class Translation71 {
    ublic MergeShardsResponse MergeShards(MergeShardsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = MergeShardsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = MergeShardsResponseUnmarshaller.Instance;
    return Invoke<MergeShardsResponse>(request, options);
}
}