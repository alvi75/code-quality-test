using System;
using System.Collections.Generic;

public class Translation852
{
    public virtual UndeprecateDomainResponse UndeprecateDomain(UndeprecateDomainRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = UndeprecateDomainRequestMarshaller.Instance;
    options.ResponseUnmarshaller = UndeprecateDomainResponseUnmarshaller.Instance;
    return Invoke<UndeprecateDomainResponse>(request, options);
}
}