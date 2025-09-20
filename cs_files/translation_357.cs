using System;
using System.Collections.Generic;

public class Translation357
{
    public virtual DeleteDatasetResponse DeleteDataset(DeleteDatasetRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeleteDatasetRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeleteDatasetResponseUnmarshaller.Instance;
    return Invoke<DeleteDatasetResponse>(request, options);
}
}