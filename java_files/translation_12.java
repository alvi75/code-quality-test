import java.util.*;

public class Translation12 {
    ublic GetShardIteratorResponse GetShardIterator(GetShardIteratorRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetShardIteratorRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetShardIteratorResponseUnmarshaller.Instance;
    return Invoke<GetShardIteratorResponse>(request, options);
}
}