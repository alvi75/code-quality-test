ublic DeleteClusterSubnetGroupResponse DeleteClusterSubnetGroup(DeleteClusterSubnetGroupRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeleteClusterSubnetGroupRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeleteClusterSubnetGroupResponseUnmarshaller.Instance;
    return Invoke<DeleteClusterSubnetGroupResponse>(request, options);
}