using System;
using System.Collections.Generic;

public class Translation494
{
    public virtual ListUserProfilesResponse ListUserProfiles(ListUserProfilesRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ListUserProfilesRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ListUserProfilesResponseUnmarshaller.Instance;
    return Invoke<ListUserProfilesResponse>(request, options);
}
}