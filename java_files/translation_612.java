public CreateRoomResult createRoom(CreateRoomRequest request) {
    request = beforeClientExecution(request);
    return executeCreateRoom(request);
}