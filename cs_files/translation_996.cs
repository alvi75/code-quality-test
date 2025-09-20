using System;
using System.Collections.Generic;

public class Translation996
{
    public virtual AssociateSkillGroupWithRoomResponse AssociateSkillGroupWithRoom(AssociateSkillGroupWithRoomRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = AssociateSkillGroupWithRoomRequestMarshaller.Instance;
    options.ResponseUnmarshaller = AssociateSkillGroupWithRoomResponseUnmarshaller.Instance;
    return Invoke<AssociateSkillGroupWithRoomResponse>(request, options);
}
}