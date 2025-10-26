import java.util.*;

public class Translation600 {
    ublic CreateDomainEntryResponse CreateDomainEntry(CreateDomainEntryRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CreateDomainEntryRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreateDomainEntryResponseUnmarshaller.Instance;
    return Invoke<CreateDomainEntryResponse>(request, options);
}
}