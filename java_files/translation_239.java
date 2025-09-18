public DescribeStackEventsResult describeStackEvents(DescribeStackEventsRequest request) {
    request = beforeClientExecution(request);
    return executeDescribeStackEvents(request);
}