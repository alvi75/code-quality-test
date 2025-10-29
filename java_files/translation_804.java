import java.util.*;

public class Translation804 {
    ublic CreateProjectVersionResponse CreateProjectVersion(CreateProjectVersionRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CreateProjectVersionRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreateProjectVersionResponseUnmarshaller.Instance;
    return Invoke<CreateProjectVersionResponse>(request, options);
}
}