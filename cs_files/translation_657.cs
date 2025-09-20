using System;
using System.Collections.Generic;

public class Translation657
{
    public virtual ListFacesResponse ListFaces(ListFacesRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ListFacesRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ListFacesResponseUnmarshaller.Instance;
    return Invoke<ListFacesResponse>(request, options);
}
}