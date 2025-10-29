import java.util.*;

public class Translation865 {
    ublic DescribeLagsResult DescribeLags(DescribeLagsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeLagsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeLagsResponseUnmarshaller.Instance;
    return Invoke<DescribeLagsResponse>(request, options);
}
}