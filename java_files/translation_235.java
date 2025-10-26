ublic DescribeDashboardPermissionsResponse DescribeDashboardPermissions(DescribeDashboardPermissionsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeDashboardPermissionsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeDashboardPermissionsResponseUnmarshaller.Instance;
    return Invoke<DescribeDashboardPermissionsResponse>(request, options);
}