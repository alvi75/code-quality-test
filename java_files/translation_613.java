ublic DeleteReplicationGroupResponse DeleteReplicationGroup(DeleteReplicationGroupRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeleteReplicationGroupRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeleteReplicationGroupResponseUnmarshaller.Instance;
    return Invoke<DeleteReplicationGroupResponse>(request, options);
}