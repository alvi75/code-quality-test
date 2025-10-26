ublic EnableAlarmActionsResponse EnableAlarmActions(EnableAlarmActionsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = EnableAlarmActionsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = EnableAlarmActionsResponseUnmarshaller.Instance;
    return Invoke<EnableAlarmActionsResponse>(request, options);
}