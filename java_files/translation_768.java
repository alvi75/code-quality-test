import java.util.*;

public class Translation768 {
    ublic ActivateUserResponse ActivateUser(ActivateUserRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ActivateUserRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ActivateUserResponseUnmarshaller.Instance;
    return Invoke<ActivateUserResponse>(request, options);
}
}