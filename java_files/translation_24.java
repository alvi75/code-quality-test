import java.util.*;

public class Translation24 {
    ublic ModifyCacheSubnetGroupResponse ModifyCacheSubnetGroup(ModifyCacheSubnetGroupRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ModifyCacheSubnetGroupRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ModifyCacheSubnetGroupResponseUnmarshaller.Instance;
    return Invoke<ModifyCacheSubnetGroupResponse>(request, options);
}
}