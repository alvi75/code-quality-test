import java.util.*;

public class Translation214 {
    ublic GetDiskResponse GetDisk(GetDiskRequest request) {
    var options = new InvokeOptions();
    options.RequestMarshaller = GetDiskRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetDiskResponseUnmarshaller.Instance;
    return Invoke<GetDiskResponse>(request, options);
}
}