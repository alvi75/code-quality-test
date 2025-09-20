using System;
using System.Collections.Generic;

public class Translation859
{
    public virtual GetCelebrityRecognitionResponse GetCelebrityRecognition(GetCelebrityRecognitionRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetCelebrityRecognitionRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetCelebrityRecognitionResponseUnmarshaller.Instance;
    return Invoke<GetCelebrityRecognitionResponse>(request, options);
}
}