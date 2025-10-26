ublic CreateStreamingDistributionResponse CreateStreamingDistribution(CreateStreamingDistributionRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CreateStreamingDistributionRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreateStreamingDistributionResponseUnmarshaller.Instance;
    return Invoke<CreateStreamingDistributionResponse>(request, options);
}