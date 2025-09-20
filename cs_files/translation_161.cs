using System;
using System.Collections.Generic;

public class Translation161
{
    public virtual GetFieldLevelEncryptionConfigResponse GetFieldLevelEncryptionConfig(GetFieldLevelEncryptionConfigRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetFieldLevelEncryptionConfigRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetFieldLevelEncryptionConfigResponseUnmarshaller.Instance;
    return Invoke<GetFieldLevelEncryptionConfigResponse>(request, options);
}
}