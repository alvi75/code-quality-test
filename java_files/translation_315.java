ublic DeleteAccessControlRuleResponse DeleteAccessControlRule(DeleteAccessControlRuleRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeleteAccessControlRuleRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeleteAccessControlRuleResponseUnmarshaller.Instance;
    return Invoke<DeleteAccessControlRuleResponse>(request, options);
}