import java.util.*;

public class Translation792 {
    ublic UpdateRecommenderConfigurationResponse UpdateRecommenderConfiguration(UpdateRecommenderConfigurationRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = UpdateRecommenderConfigurationRequestMarshaller.Instance;
    options.ResponseUnmarshaller = UpdateRecommenderConfigurationResponseUnmarshaller.Instance;
    return Invoke<UpdateRecommenderConfigurationResponse>(request, options);
}
}