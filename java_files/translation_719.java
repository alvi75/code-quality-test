public ModifyVolumeResult modifyVolume(ModifyVolumeRequest request) {
    request = beforeClientExecution(request);
    return executeModifyVolume(request);
}