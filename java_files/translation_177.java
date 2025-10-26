ublic StopWorkspacesResponse StopWorkspaces(StopWorkspacesRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = StopWorkspacesRequestMarshaller.Instance;
    options.ResponseUnmarshaller = StopWorkspacesResponseUnmarshaller.Instance;
    return Invoke<StopWorkspacesResponse>(request, options);
}