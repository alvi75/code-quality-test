using System;
using System.Collections.Generic;

public class Translation910
{
    public virtual Stream OpenResource(string resource){
    Stream stream;
    if (resource.StartsWith("__", StringComparison.Ordinal)){
        stream = _resources[resource];
    }
    else{
        stream = typeof(HttpClient).GetResourceStream(resource);
    }
    if (stream == null){
        throw new FileNotFoundException("Resource not found: " + resource);
    }
    return stream;
}
}