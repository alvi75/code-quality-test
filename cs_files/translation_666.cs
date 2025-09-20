using System;
using System.Collections.Generic;

public class Translation666
{
    public virtual ListChangeSetsResponse ListChangeSets(ListChangeSetsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ListChangeSetsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ListChangeSetsResponseUnmarshaller.Instance;
    return Invoke<ListChangeSetsResponse>(request, options);
}
}