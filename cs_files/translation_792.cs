using System;
using System.Collections.Generic;

public class Translation792
{
    public virtual UpdateRecommenderConfigurationResponse UpdateRecommenderConfiguration(UpdateRecommenderConfigurationRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = UpdateRecommenderConfigurationRequestMarshaller.Instance;
    options.ResponseUnmarshaller = UpdateRecommenderConfigurationResponseUnmarshaller.Instance;
    return Invoke<UpdateRecommenderConfigurationResponse>(request, options);
}
}