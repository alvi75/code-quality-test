ublic DescribeSnapshotSchedulesResponse DescribeSnapshotSchedules(DescribeSnapshotSchedulesRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeSnapshotSchedulesRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeSnapshotSchedulesResponseUnmarshaller.Instance;
    return Invoke<DescribeSnapshotSchedulesResponse>(request, options);
}