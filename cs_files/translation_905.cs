using System;
using System.Collections.Generic;

public class Translation905
{
    public virtual DeleteDataSourceResponse DeleteDataSource(DeleteDataSourceRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeleteDataSourceRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeleteDataSourceResponseUnmarshaller.Instance;
    return Invoke<DeleteDataSourceResponse>(request, options);
}
}