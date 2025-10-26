ublic RespondActivityTaskCompletedResponse RespondActivityTaskCompleted(RespondActivityTaskCompletedRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = RespondActivityTaskCompletedRequestMarshaller.Instance;
    options.ResponseUnmarshaller = RespondActivityTaskCompletedResponseUnmarshaller.Instance;
    return Invoke<RespondActivityTaskCompletedResponse>(request, options);
}