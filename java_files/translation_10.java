ublic ListIngestionsResponse ListIngestions(ListIngestionsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ListIngestionsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ListIngestionsResponseUnmarshaller.Instance;
    return Invoke<ListIngestionsResponse>(request, options);
}