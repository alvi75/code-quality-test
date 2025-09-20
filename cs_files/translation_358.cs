using System;
using System.Collections.Generic;

public class Translation358
{
    public virtual StartRelationalDatabaseResponse StartRelationalDatabase(StartRelationalDatabaseRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = StartRelationalDatabaseRequestMarshaller.Instance;
    options.ResponseUnmarshaller = StartRelationalDatabaseResponseUnmarshaller.Instance;
    return Invoke<StartRelationalDatabaseResponse>(request, options);
}
}