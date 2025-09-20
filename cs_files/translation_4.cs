using System;
using System.Collections.Generic;

public class Translation4
{
    public virtual DeleteDomainEntryResponse DeleteDomainEntry(DeleteDomainEntryRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeleteDomainEntryRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeleteDomainEntryResponseUnmarshaller.Instance;
    return Invoke<DeleteDomainEntryResponse>(request, options);
}
}