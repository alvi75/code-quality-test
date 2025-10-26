ublic PromoteReadReplicaDBClusterResponse PromoteReadReplicaDBCluster(PromoteReadReplicaDBClusterRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = PromoteReadReplicaDBClusterRequestMarshaller.Instance;
    options.ResponseUnmarshaller = PromoteReadReplicaDBClusterResponseUnmarshaller.Instance;
    return Invoke<PromoteReadReplicaDBClusterResponse>(request, options);
}