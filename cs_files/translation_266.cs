using System;
using System.Collections.Generic;

public class Translation266
{
    public virtual GetFolderResponse GetFolder(GetFolderRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetFolderRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetFolderResponseUnmarshaller.Instance;
    return Invoke<GetFolderResponse>(request, options);
}
}