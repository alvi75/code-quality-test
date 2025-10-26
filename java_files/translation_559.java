ublic DescribeVaultResponse DescribeVault(DescribeVaultRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeVaultRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeVaultResponseUnmarshaller.Instance;
    return Invoke<DescribeVaultResponse>(request, options);
}