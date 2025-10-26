import java.util.*;

public class Translation78 {
    ublic DescribeNotebookInstanceLifecycleConfigResponse DescribeNotebookInstanceLifecycleConfig(DescribeNotebookInstanceLifecycleConfigRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeNotebookInstanceLifecycleConfigRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeNotebookInstanceLifecycleConfigResponseUnmarshaller.Instance;
    return Invoke<DescribeNotebookInstanceLifecycleConfigResponse>(request, options);
}
}