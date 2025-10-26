import java.util.*;

public class Translation114 {
    ublic UploadArchiveResponse UploadArchive(UploadArchiveRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = UploadArchiveRequestMarshaller.Instance;
    options.ResponseUnmarshaller = UploadArchiveResponseUnmarshaller.Instance;
    return Invoke<UploadArchiveResponse>(request, options);
}
}