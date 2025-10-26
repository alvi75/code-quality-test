import java.util.*;

public class Translation694 {
    ublic DeleteMembersResponse DeleteMembers(DeleteMembersRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeleteMembersRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeleteMembersResponseUnmarshaller.Instance;
    return Invoke<DeleteMembersResponse>(request, options);
}
}