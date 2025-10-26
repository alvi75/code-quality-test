ublic AssociateMemberAccountResponse AssociateMemberAccount(AssociateMemberAccountRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = AssociateMemberAccountRequestMarshaller.Instance;
    options.ResponseUnmarshaller = AssociateMemberAccountResponseUnmarshaller.Instance;
    return Invoke<AssociateMemberAccountResponse>(request, options);
}