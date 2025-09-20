using System;
using System.Collections.Generic;

public class Translation674
{
    public virtual ListAssessmentTemplatesResponse ListAssessmentTemplates(ListAssessmentTemplatesRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ListAssessmentTemplatesRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ListAssessmentTemplatesResponseUnmarshaller.Instance;
    return Invoke<ListAssessmentTemplatesResponse>(request, options);
}
}