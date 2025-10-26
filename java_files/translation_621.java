ublic CompleteVaultLockResponse CompleteVaultLock(CompleteVaultLockRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CompleteVaultLockRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CompleteVaultLockResponseUnmarshaller.Instance;
    return Invoke<CompleteVaultLockResponse>(request, options);
}