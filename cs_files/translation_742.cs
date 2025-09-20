using System;
using System.Collections.Generic;

public class Translation742
{
    public virtual DeleteUserByPrincipalIdResponse DeleteUserByPrincipalId(DeleteUserByPrincipalIdRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeleteUserByPrincipalIdRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeleteUserByPrincipalIdResponseUnmarshaller.Instance;
    return Invoke<DeleteUserByPrincipalIdResponse>(request, options);
}
}