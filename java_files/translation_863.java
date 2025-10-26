import java.util.*;

public class Translation863 {
    ublic MoveAddressToVpcResponse MoveAddressToVpc(MoveAddressToVpcRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = MoveAddressToVpcRequestMarshaller.Instance;
    options.ResponseUnmarshaller = MoveAddressToVpcResponseUnmarshaller.Instance;
    return Invoke<MoveAddressToVpcResponse>(request, options);
}
}