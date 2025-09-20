using System;
using System.Collections.Generic;

public class Translation349
{
    public virtual DescribeReceiptRuleSetResponse DescribeReceiptRuleSet(DescribeReceiptRuleSetRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeReceiptRuleSetRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeReceiptRuleSetResponseUnmarshaller.Instance;
    return Invoke<DescribeReceiptRuleSetResponse>(request, options);
}
}