using System;
using System.Collections.Generic;

public class Translation593
{
    public virtual ListTaskDefinitionFamiliesResponse ListTaskDefinitionFamilies(ListTaskDefinitionFamiliesRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ListTaskDefinitionFamiliesRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ListTaskDefinitionFamiliesResponseUnmarshaller.Instance;
    return Invoke<ListTaskDefinitionFamiliesResponse>(request, options);
}
}