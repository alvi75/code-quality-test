ublic DescribeCapacityReservationsResponse DescribeCapacityReservations(DescribeCapacityReservationsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeCapacityReservationsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeCapacityReservationsResponseUnmarshaller.Instance;
    return Invoke<DescribeCapacityReservationsResponse>(request, options);
}