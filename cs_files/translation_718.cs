using System;
using System.Collections.Generic;

public class Translation718
{
    public virtual UpdateAssessmentTargetResponse UpdateAssessmentTarget(UpdateAssessmentTargetRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = UpdateAssessmentTargetRequestMarshaller.Instance;
    options.ResponseUnmarshaller = UpdateAssessmentTargetResponseUnmarshaller.Instance;
    return Invoke<UpdateAssessmentTargetResponse>(request, options);
}
}