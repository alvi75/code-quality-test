import java.util.*;

public class Translation612 {
    ublic CreateRoomResponse CreateRoom(CreateRoomRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CreateRoomRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreateRoomResponseUnmarshaller.Instance;
    return Invoke<CreateRoomResponse>(request, options);
}
}