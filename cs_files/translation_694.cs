using System;
using System.Collections.Generic;

public class Translation694
{
    public virtual DeleteMembersResponse DeleteMembers(DeleteMembersRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeleteMembersRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeleteMembersResponseUnmarshaller.Instance;
    return Invoke<DeleteMembersResponse>(request, options);
}
}