import java.util.*;

public class Translation100 {
    public DescribeRepositoriesResult describeRepositories(DescribeRepositoriesRequest request) {
    request = beforeClientExecution(request);
    return executeDescribeRepositories(request);
}
}