import java.util.*;

public class Translation662 {
    ublic DescribeHostReservationsResponse DescribeHostReservations(DescribeHostReservationsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeHostReservationsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeHostReservationsResponseUnmarshaller.Instance;
    return Invoke<DescribeHostReservationsResponse>(request, options);
}
}