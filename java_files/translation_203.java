ublic DescribeDashboardResponse DescribeDashboard(DescribeDashboardRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeDashboardRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeDashboardResponseUnmarshaller.Instance;
    return Invoke<DescribeDashboardResponse>(request, options);
}