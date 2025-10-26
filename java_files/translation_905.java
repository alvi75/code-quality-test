import java.util.*;

public class Translation905 {
    ublic DeleteDataSourceResponse DeleteDataSource(DeleteDataSourceRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeleteDataSourceRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeleteDataSourceResponseUnmarshaller.Instance;
    return Invoke<DeleteDataSourceResponse>(request, options);
}
}