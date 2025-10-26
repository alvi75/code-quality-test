ublic UpdateHITTypeOfHITResponse UpdateHITTypeOfHIT(UpdateHITTypeOfHITRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = UpdateHITTypeOfHITRequestMarshaller.Instance;
    options.ResponseUnmarshaller = UpdateHITTypeOfHITResponseUnmarshaller.Instance;
    return Invoke<UpdateHITTypeOfHITResponse>(request, options);
}