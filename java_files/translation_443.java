import java.util.*;

public class Translation443 {
    ublic CreateOptionGroupResponse CreateOptionGroup(CreateOptionGroupRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CreateOptionGroupRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreateOptionGroupResponseUnmarshaller.Instance;
    return Invoke<CreateOptionGroupResponse>(request, options);
}
}