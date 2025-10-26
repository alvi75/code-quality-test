ublic UpdateRuleVersionResponse UpdateRuleVersion(UpdateRuleVersionRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = UpdateRuleVersionRequestMarshaller.Instance;
    options.ResponseUnmarshaller = UpdateRuleVersionResponseUnmarshaller.Instance;
    return Invoke<UpdateRuleVersionResponse>(request, options);
}