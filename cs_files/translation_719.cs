using System;
using System.Collections.Generic;

public class Translation719
{
    public virtual ModifyVolumeResponse ModifyVolume(ModifyVolumeRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ModifyVolumeRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ModifyVolumeResponseUnmarshaller.Instance;
    return Invoke<ModifyVolumeResponse>(request, options);
}
}