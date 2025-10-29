import java.util.*;

public class Translation597 {
    ublic ListAvailableManagementCidrRangesResponse ListAvailableManagementCidrRanges(ListAvailableManagementCidrRangesRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ListAvailableManagementCidrRangesRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ListAvailableManagementCidrRangesResponseUnmarshaller.Instance;
    return Invoke<ListAvailableManagementCidrRangesResponse>(request, options);
}
}