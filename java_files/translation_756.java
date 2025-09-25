import java.util.*;

public class Translation756 {
    public GetRepoBuildListResult getRepoBuildList(GetRepoBuildListRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetRepoBuildListRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetRepoBuildListResponseUnmarshaller.Instance;
    return Invoke<GetRepoBuildListResult>(request, options);
}
}