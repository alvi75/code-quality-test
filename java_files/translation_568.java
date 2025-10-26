import java.util.*;

public class Translation568 {
    ublic ListAppliedSchemaArnsResponse ListAppliedSchemaArns(ListAppliedSchemaArnsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ListAppliedSchemaArnsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ListAppliedSchemaArnsResponseUnmarshaller.Instance;
    return Invoke<ListAppliedSchemaArnsResponse>(request, options);
}
}