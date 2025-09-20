using System;
using System.Collections.Generic;

public class Translation955
{
    public virtual CreateDataSourceFromRedshiftResponse CreateDataSourceFromRedshift(CreateDataSourceFromRedshiftRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CreateDataSourceFromRedshiftRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreateDataSourceFromRedshiftResponseUnmarshaller.Instance;
    return Invoke<CreateDataSourceFromRedshiftResponse>(request, options);
}
}