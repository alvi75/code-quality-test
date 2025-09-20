using System;
using System.Collections.Generic;

public class Translation803
{
    public virtual DeleteApplicationReferenceDataSourceResponse DeleteApplicationReferenceDataSource(DeleteApplicationReferenceDataSourceRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeleteApplicationReferenceDataSourceRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeleteApplicationReferenceDataSourceResponseUnmarshaller.Instance;
    return Invoke<DeleteApplicationReferenceDataSourceResponse>(request, options);
}
}