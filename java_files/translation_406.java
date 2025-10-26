import java.util.*;

public class Translation406 {
    ublic UpdateParameterGroupResponse UpdateParameterGroup(UpdateParameterGroupRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = UpdateParameterGroupRequestMarshaller.Instance;
    options.ResponseUnmarshaller = UpdateParameterGroupResponseUnmarshaller.Instance;
    return Invoke<UpdateParameterGroupResponse>(request, options);
}
}