ublic DeleteLogPatternResponse DeleteLogPattern(DeleteLogPatternRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeleteLogPatternRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeleteLogPatternResponseUnmarshaller.Instance;
    return Invoke<DeleteLogPatternResponse>(request, options);
}