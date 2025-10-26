import java.util.*;

public class Translation349 {
    ublic DescribeReceiptRuleSetResponse DescribeReceiptRuleSet(DescribeReceiptRuleSetRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeReceiptRuleSetRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeReceiptRuleSetResponseUnmarshaller.Instance;
    return Invoke<DescribeReceiptRuleSetResponse>(request, options);
}
}