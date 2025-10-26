ublic DeleteMailboxPermissionsResponse DeleteMailboxPermissions(DeleteMailboxPermissionsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeleteMailboxPermissionsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeleteMailboxPermissionsResponseUnmarshaller.Instance;
    return Invoke<DeleteMailboxPermissionsResponse>(request, options);
}