import java.util.*;

public class Translation238 {
    ublic GetDomainSuggestionsResponse GetDomainSuggestions(GetDomainSuggestionsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetDomainSuggestionsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetDomainSuggestionsResponseUnmarshaller.Instance;
    return Invoke<GetDomainSuggestionsResponse>(request, options);
}
}