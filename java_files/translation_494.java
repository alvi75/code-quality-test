import java.util.*;

public class Translation494 {
    ublic ListUserProfilesResponse ListUserProfiles(ListUserProfilesRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ListUserProfilesRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ListUserProfilesResponseUnmarshaller.Instance;
    return Invoke<ListUserProfilesResponse>(request, options);
}
}