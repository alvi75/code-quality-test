ublic SetTerminationProtectionResponse SetTerminationProtection(SetTerminationProtectionRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = SetTerminationProtectionRequestMarshaller.Instance;
    options.ResponseUnmarshaller = SetTerminationProtectionResponseUnmarshaller.Instance;
    return Invoke<SetTerminationProtectionResponse>(request, options);
}