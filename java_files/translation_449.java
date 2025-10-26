ublic StopSentimentDetectionJobResponse StopSentimentDetectionJob(StopSentimentDetectionJobRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = StopSentimentDetectionJobRequestMarshaller.Instance;
    options.ResponseUnmarshaller = StopSentimentDetectionJobResponseUnmarshaller.Instance;
    return Invoke<StopSentimentDetectionJobResponse>(request, options);
}