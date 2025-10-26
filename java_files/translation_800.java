import java.util.*;

public class Translation800 {
    ublic UpdateDataSourcePermissionsResponse UpdateDataSourcePermissions(UpdateDataSourcePermissionsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = UpdateDataSourcePermissionsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = UpdateDataSourcePermissionsResponseUnmarshaller.Instance;
    return Invoke<UpdateDataSourcePermissionsResponse>(request, options);
}
}