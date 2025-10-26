ublic UpdateDetectorVersionResponse UpdateDetectorVersion(UpdateDetectorVersionRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = UpdateDetectorVersionRequestMarshaller.Instance;
    options.ResponseUnmarshaller = UpdateDetectorVersionResponseUnmarshaller.Instance;
    return Invoke<UpdateDetectorVersionResponse>(request, options);
}