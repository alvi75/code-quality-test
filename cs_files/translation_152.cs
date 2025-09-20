using System;
using System.Collections.Generic;

public class Translation152
{
    public virtual ListTextTranslationJobsResponse ListTextTranslationJobs(ListTextTranslationJobsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ListTextTranslationJobsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ListTextTranslationJobsResponseUnmarshaller.Instance;
    return Invoke<ListTextTranslationJobsResponse>(request, options);
}
}