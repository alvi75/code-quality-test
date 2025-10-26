import java.util.*;

public class Translation31 {
    ublic GetDashboardResponse GetDashboard(GetDashboardRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetDashboardRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetDashboardResponseUnmarshaller.Instance;
    return Invoke<GetDashboardResponse>(request, options);
}
}