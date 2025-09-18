public UploadArchiveResult uploadArchive(UploadArchiveRequest request) {
    request = beforeClientExecution(request);
    return executeUploadArchive(request);
}