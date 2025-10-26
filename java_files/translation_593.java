import java.util.*;

public class Translation593 {
    ublic ListTaskDefinitionFamiliesResponse ListTaskDefinitionFamilies(ListTaskDefinitionFamiliesRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ListTaskDefinitionFamiliesRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ListTaskDefinitionFamiliesResponseUnmarshaller.Instance;
    return Invoke<ListTaskDefinitionFamiliesResponse>(request, options);
}
}