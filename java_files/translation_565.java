ublic GetBaiduChannelResponse GetBaiduChannel(GetBaiduChannelRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetBaiduChannelRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetBaiduChannelResponseUnmarshaller.Instance;
    return Invoke<GetBaiduChannelResponse>(request, options);
}