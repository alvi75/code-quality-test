ublic DescribeTopicsDetectionJobResponse DescribeTopicsDetectionJob(DescribeTopicsDetectionJobRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeTopicsDetectionJobRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeTopicsDetectionJobResponseUnmarshaller.Instance;
    return Invoke<DescribeTopicsDetectionJobResponse>(request, options);
}