ublic AssociateMemberToGroupResponse AssociateMemberToGroup(AssociateMemberToGroupRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = AssociateMemberToGroupRequestMarshaller.Instance;
    options.ResponseUnmarshaller = AssociateMemberToGroupResponseUnmarshaller.Instance;
    return Invoke<AssociateMemberToGroupResponse>(request, options);
}