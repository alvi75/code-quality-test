ublic CreateSnapshotScheduleResponse CreateSnapshotSchedule(CreateSnapshotScheduleRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CreateSnapshotScheduleRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreateSnapshotScheduleResponseUnmarshaller.Instance;
    return Invoke<CreateSnapshotScheduleResponse>(request, options);
}