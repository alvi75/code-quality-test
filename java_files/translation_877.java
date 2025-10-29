import java.util.*;

public class Translation877 {
    ublic ListImagesResponse ListImages(ListImagesRequest request) {
    var options = new InvokeOptions();
    options.RequestMarshaller = ListImagesRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ListImagesResponseUnmarshaller.Instance;
    return Invoke<ListImagesResponse>(request, options);
}
}