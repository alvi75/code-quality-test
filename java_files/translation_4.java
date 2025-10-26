import java.util.*;

public class Translation4 {
    ublic DeleteDomainEntryResponse DeleteDomainEntry(DeleteDomainEntryRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeleteDomainEntryRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeleteDomainEntryResponseUnmarshaller.Instance;
    return Invoke<DeleteDomainEntryResponse>(request, options);
}
}