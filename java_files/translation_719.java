import java.util.*;

public class Translation719 {
    ublic ModifyVolumeResponse ModifyVolume(ModifyVolumeRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ModifyVolumeRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ModifyVolumeResponseUnmarshaller.Instance;
    return Invoke<ModifyVolumeResponse>(request, options);
}
}