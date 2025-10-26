import java.util.*;

public class Translation227 {
    ublic GetJobUnlockCodeResponse GetJobUnlockCode(GetJobUnlockCodeRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetJobUnlockCodeRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetJobUnlockCodeResponseUnmarshaller.Instance;
    return Invoke<GetJobUnlockCodeResponse>(request, options);
}
}