ublic UndeprecateDomainResponse UndeprecateDomain(UndeprecateDomainRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = UndeprecateDomainRequestMarshaller.Instance;
    options.ResponseUnmarshaller = UndeprecateDomainResponseUnmarshaller.Instance;
    return Invoke<UndeprecateDomainResponse>(request, options);
}