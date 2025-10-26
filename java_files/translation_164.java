import java.util.*;

public class Translation164 {
    ublic DeleteAlarmResponse DeleteAlarm(DeleteAlarmRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeleteAlarmRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeleteAlarmResponseUnmarshaller.Instance;
    return Invoke<DeleteAlarmResponse>(request, options);
}
}