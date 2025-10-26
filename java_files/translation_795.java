import java.util.*;

public class Translation795 {
    ublic DescribeDBSnapshotsResponse DescribeDBSnapshots(DescribeDBSnapshotsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeDBSnapshotsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeDBSnapshotsResponseUnmarshaller.Instance;
    return Invoke<DescribeDBSnapshotsResponse>(request, options);
}
}