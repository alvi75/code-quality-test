import java.util.*;

public class Translation751 {
    ublic ModifyAccountResponse ModifyAccount(ModifyAccountRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ModifyAccountRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ModifyAccountResponseUnmarshaller.Instance;
    return Invoke<ModifyAccountResponse>(request, options);
}
}