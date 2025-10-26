ublic GetHostedZoneLimitResponse GetHostedZoneLimit(GetHostedZoneLimitRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetHostedZoneLimitRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetHostedZoneLimitResponseUnmarshaller.Instance;
    return Invoke<GetHostedZoneLimitResponse>(request, options);
}