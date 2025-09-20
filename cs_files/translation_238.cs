using System;
using System.Collections.Generic;

public class Translation238
{
    public virtual GetDomainSuggestionsResponse GetDomainSuggestions(GetDomainSuggestionsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetDomainSuggestionsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetDomainSuggestionsResponseUnmarshaller.Instance;
    return Invoke<GetDomainSuggestionsResponse>(request, options);
}
}