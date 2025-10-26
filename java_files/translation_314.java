ublic ListAssignmentsForHITResponse ListAssignmentsForHIT(ListAssignmentsForHITRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ListAssignmentsForHITRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ListAssignmentsForHITResponseUnmarshaller.Instance;
    return Invoke<ListAssignmentsForHITResponse>(request, options);
}