ublic CreatePresignedDomainUrlResponse CreatePresignedDomainUrl(CreatePresignedDomainUrlRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CreatePresignedDomainUrlRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreatePresignedDomainUrlResponseUnmarshaller.Instance;
    return Invoke<CreatePresignedDomainUrlResponse>(request, options);
}