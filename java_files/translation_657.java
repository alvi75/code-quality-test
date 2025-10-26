import java.util.*;

public class Translation657 {
    ublic ListFacesResponse ListFaces(ListFacesRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ListFacesRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ListFacesResponseUnmarshaller.Instance;
    return Invoke<ListFacesResponse>(request, options);
}
}