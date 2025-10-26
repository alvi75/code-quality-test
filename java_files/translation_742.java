import java.util.*;

public class Translation742 {
    ublic DeleteUserByPrincipalIdResponse DeleteUserByPrincipalId(DeleteUserByPrincipalIdRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeleteUserByPrincipalIdRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeleteUserByPrincipalIdResponseUnmarshaller.Instance;
    return Invoke<DeleteUserByPrincipalIdResponse>(request, options);
}
}