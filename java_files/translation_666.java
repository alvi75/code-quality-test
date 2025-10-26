import java.util.*;

public class Translation666 {
    ublic ListChangeSetsResponse ListChangeSets(ListChangeSetsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ListChangeSetsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ListChangeSetsResponseUnmarshaller.Instance;
    return Invoke<ListChangeSetsResponse>(request, options);
}
}