using System;
using System.Collections.Generic;

public class Translation800
{
    public virtual UpdateDataSourcePermissionsResponse UpdateDataSourcePermissions(UpdateDataSourcePermissionsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = UpdateDataSourcePermissionsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = UpdateDataSourcePermissionsResponseUnmarshaller.Instance;
    return Invoke<UpdateDataSourcePermissionsResponse>(request, options);
}
}