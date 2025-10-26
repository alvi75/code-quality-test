ublic GetInstanceAccessDetailsResponse GetInstanceAccessDetails(GetInstanceAccessDetailsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetInstanceAccessDetailsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetInstanceAccessDetailsResponseUnmarshaller.Instance;
    return Invoke<GetInstanceAccessDetailsResponse>(request, options);
}