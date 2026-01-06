import java.util.*;

public class Translation285 {
    ublic DedicatedIpPool createDedicatedIpPool(CreateDedicatedIpPoolRequest request) {
    var options = new InvokeOptions();
    options.RequestMarshaller = CreateDedicatedIpPoolRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreateDedicatedIpPoolResponseUnmarshaller.Instance;
    return Invoke<DedicatedIpPool>(request, options);
}
}