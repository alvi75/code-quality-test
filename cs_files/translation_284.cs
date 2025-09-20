using System;
using System.Collections.Generic;

public class Translation284
{
    public virtual CreateExportJobResponse CreateExportJob(CreateExportJobRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CreateExportJobRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreateExportJobResponseUnmarshaller.Instance;
    return Invoke<CreateExportJobResponse>(request, options);
}
}