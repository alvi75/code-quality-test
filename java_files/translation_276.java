import java.util.*;

public class Translation276 {
    ublic CreateDBSubnetGroupResponse CreateDBSubnetGroup(CreateDBSubnetGroupRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CreateDBSubnetGroupRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreateDBSubnetGroupResponseUnmarshaller.Instance;
    return Invoke<CreateDBSubnetGroupResponse>(request, options);
}
}