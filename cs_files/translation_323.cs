using System;
using System.Collections.Generic;

public class Translation323
{
    public virtual UpdateDetectorVersionResponse UpdateDetectorVersion(UpdateDetectorVersionRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = UpdateDetectorVersionRequestMarshaller.Instance;
    options.ResponseUnmarshaller = UpdateDetectorVersionResponseUnmarshaller.Instance;
    return Invoke<UpdateDetectorVersionResponse>(request, options);
}
}