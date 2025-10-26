import java.util.*;

public class Translation688 {
    ublic CreatePlayerSessionsResponse CreatePlayerSessions(CreatePlayerSessionsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CreatePlayerSessionsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreatePlayerSessionsResponseUnmarshaller.Instance;
    return Invoke<CreatePlayerSessionsResponse>(request, options);
}
}