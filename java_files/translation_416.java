import java.util.*;

public class Translation416 {
    ublic IndexFacesResponse IndexFaces(IndexFacesRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = IndexFacesRequestMarshaller.Instance;
    options.ResponseUnmarshaller = IndexFacesResponseUnmarshaller.Instance;
    return Invoke<IndexFacesResponse>(request, options);
}
}