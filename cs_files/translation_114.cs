using System;
using System.Collections.Generic;

public class Translation114
{
    public virtual UploadArchiveResponse UploadArchive(UploadArchiveRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = UploadArchiveRequestMarshaller.Instance;
    options.ResponseUnmarshaller = UploadArchiveResponseUnmarshaller.Instance;
    return Invoke<UploadArchiveResponse>(request, options);
}
}