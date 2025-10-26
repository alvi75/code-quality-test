ublic ListDominantLanguageDetectionJobsResponse ListDominantLanguageDetectionJobs(ListDominantLanguageDetectionJobsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ListDominantLanguageDetectionJobsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ListDominantLanguageDetectionJobsResponseUnmarshaller.Instance;
    return Invoke<ListDominantLanguageDetectionJobsResponse>(request, options);
}