using System;
using System.Collections.Generic;

public class Translation714
{
    public virtual ListDirectoriesResponse ListDirectories(ListDirectoriesRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ListDirectoriesRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ListDirectoriesResponseUnmarshaller.Instance;
    return Invoke<ListDirectoriesResponse>(request, options);
}
}