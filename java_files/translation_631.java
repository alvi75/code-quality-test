import java.util.*;

public class Translation631 {
    ublic DeleteVoiceConnectorOriginationResponse DeleteVoiceConnectorOrigination(DeleteVoiceConnectorOriginationRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeleteVoiceConnectorOriginationRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeleteVoiceConnectorOriginationResponseUnmarshaller.Instance;
    return Invoke<DeleteVoiceConnectorOriginationResponse>(request, options);
}
}