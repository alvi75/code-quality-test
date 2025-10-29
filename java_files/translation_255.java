import java.util.*;

public class Translation255 {
    ublic ListBonusPaymentsResponse ListBonusPayments(ListBonusPaymentsRequest request) {
    var options = new InvokeOptions();
    options.RequestMarshaller = ListBonusPaymentsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ListBonusPaymentsResponseUnmarshaller.Instance;
    return Invoke<ListBonusPaymentsResponse>(request, options);
}
}