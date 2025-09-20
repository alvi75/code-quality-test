using System;
using System.Collections.Generic;

public class Translation522
{
    public virtual DescribeDomainResponse DescribeDomain(DescribeDomainRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeDomainRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeDomainResponseUnmarshaller.Instance;
    return Invoke<DescribeDomainResponse>(request, options);
}
}