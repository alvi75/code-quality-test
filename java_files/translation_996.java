ublic AssociateSkillGroupWithRoomResponse AssociateSkillGroupWithRoom(AssociateSkillGroupWithRoomRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = AssociateSkillGroupWithRoomRequestMarshaller.Instance;
    options.ResponseUnmarshaller = AssociateSkillGroupWithRoomResponseUnmarshaller.Instance;
    return Invoke<AssociateSkillGroupWithRoomResponse>(request, options);
}