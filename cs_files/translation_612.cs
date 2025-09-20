using System;
using System.Collections.Generic;

public class Translation612
{
    public virtual CreateRoomResponse CreateRoom(CreateRoomRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CreateRoomRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreateRoomResponseUnmarshaller.Instance;
    return Invoke<CreateRoomResponse>(request, options);
}
}