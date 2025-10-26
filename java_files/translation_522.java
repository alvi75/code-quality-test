import java.util.*;

public class Translation522 {
    ublic DescribeDomainResponse DescribeDomain(DescribeDomainRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeDomainRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeDomainResponseUnmarshaller.Instance;
    return Invoke<DescribeDomainResponse>(request, options);
}
}