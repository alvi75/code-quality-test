import java.util.*;

public class Translation859 {
    ublic GetCelebrityRecognitionResponse GetCelebrityRecognition(GetCelebrityRecognitionRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetCelebrityRecognitionRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetCelebrityRecognitionResponseUnmarshaller.Instance;
    return Invoke<GetCelebrityRecognitionResponse>(request, options);
}
}