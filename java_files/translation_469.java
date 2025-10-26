ublic ListResourceRecordSetsResponse ListResourceRecordSets(ListResourceRecordSetsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ListResourceRecordSetsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ListResourceRecordSetsResponseUnmarshaller.Instance;
    return Invoke<ListResourceRecordSetsResponse>(request, options);
}