using System;
using System.Collections.Generic;

public class Translation305
{
    public virtual DescribeCapacityReservationsResponse DescribeCapacityReservations(DescribeCapacityReservationsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeCapacityReservationsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeCapacityReservationsResponseUnmarshaller.Instance;
    return Invoke<DescribeCapacityReservationsResponse>(request, options);
}
}