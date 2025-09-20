using System;
using System.Collections.Generic;

public class Translation32
{
    public virtual AssociateSigninDelegateGroupsWithAccountResponse AssociateSigninDelegateGroupsWithAccount(AssociateSigninDelegateGroupsWithAccountRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = AssociateSigninDelegateGroupsWithAccountRequestMarshaller.Instance;
    options.ResponseUnmarshaller = AssociateSigninDelegateGroupsWithAccountResponseUnmarshaller.Instance;
    return Invoke<AssociateSigninDelegateGroupsWithAccountResponse>(request, options);
}
}