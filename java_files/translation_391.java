ublic TagAttendeeResponse TagAttendee(TagAttendeeRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = TagAttendeeRequestMarshaller.Instance;
    options.ResponseUnmarshaller = TagAttendeeResponseUnmarshaller.Instance;
    return Invoke<TagAttendeeResponse>(request, options);
}