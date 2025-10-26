import java.util.*;

public class Translation152 {
    ublic ListTextTranslationJobsResponse ListTextTranslationJobs(ListTextTranslationJobsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ListTextTranslationJobsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ListTextTranslationJobsResponseUnmarshaller.Instance;
    return Invoke<ListTextTranslationJobsResponse>(request, options);
}
}