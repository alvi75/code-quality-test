using System;
using System.Collections.Generic;

public class Translation158
{
    public virtual ImportInstallationMediaResponse ImportInstallationMedia(ImportInstallationMediaRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ImportInstallationMediaRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ImportInstallationMediaResponseUnmarshaller.Instance;
    return Invoke<ImportInstallationMediaResponse>(request, options);
}
}