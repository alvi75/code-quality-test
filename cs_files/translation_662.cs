using System;
using System.Collections.Generic;

public class Translation662
{
    public virtual DescribeHostReservationsResponse DescribeHostReservations(DescribeHostReservationsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeHostReservationsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeHostReservationsResponseUnmarshaller.Instance;
    return Invoke<DescribeHostReservationsResponse>(request, options);
}
}