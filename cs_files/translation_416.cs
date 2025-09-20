using System;
using System.Collections.Generic;

public class Translation416
{
    public virtual IndexFacesResponse IndexFaces(IndexFacesRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = IndexFacesRequestMarshaller.Instance;
    options.ResponseUnmarshaller = IndexFacesResponseUnmarshaller.Instance;
    return Invoke<IndexFacesResponse>(request, options);
}
}