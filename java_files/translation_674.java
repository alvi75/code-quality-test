import java.util.*;

public class Translation674 {
    ublic ListAssessmentTemplatesResponse ListAssessmentTemplates(ListAssessmentTemplatesRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ListAssessmentTemplatesRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ListAssessmentTemplatesResponseUnmarshaller.Instance;
    return Invoke<ListAssessmentTemplatesResponse>(request, options);
}
}