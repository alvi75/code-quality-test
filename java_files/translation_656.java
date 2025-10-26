ublic DeleteApnsVoipChannelResponse DeleteApnsVoipChannel(DeleteApnsVoipChannelRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeleteApnsVoipChannelRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeleteApnsVoipChannelResponseUnmarshaller.Instance;
    return Invoke<DeleteApnsVoipChannelResponse>(request, options);
}