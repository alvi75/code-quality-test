import java.util.*;

public class Translation803 {
    ublic DeleteApplicationReferenceDataSourceResponse DeleteApplicationReferenceDataSource(DeleteApplicationReferenceDataSourceRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeleteApplicationReferenceDataSourceRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeleteApplicationReferenceDataSourceResponseUnmarshaller.Instance;
    return Invoke<DeleteApplicationReferenceDataSourceResponse>(request, options);
}
}