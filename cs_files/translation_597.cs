using System;
using System.Collections.Generic;

public class Translation597
{
    public virtual ListAvailableManagementCidrRangesResponse ListAvailableManagementCidrRanges(ListAvailableManagementCidrRangesRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ListAvailableManagementCidrRangesRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ListAvailableManagementCidrRangesResponseUnmarshaller.Instance;
    return Invoke<ListAvailableManagementCidrRangesResponse>(request, options);
}
}