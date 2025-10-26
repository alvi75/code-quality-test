ublic DescribeModelPackageResponse DescribeModelPackage(DescribeModelPackageRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeModelPackageRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeModelPackageResponseUnmarshaller.Instance;
    return Invoke<DescribeModelPackageResponse>(request, options);
}