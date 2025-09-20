using System;
using System.Collections.Generic;

public class Translation611
{
    public virtual DisableOrganizationAdminAccountResponse DisableOrganizationAdminAccount(DisableOrganizationAdminAccountRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DisableOrganizationAdminAccountRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DisableOrganizationAdminAccountResponseUnmarshaller.Instance;
    return Invoke<DisableOrganizationAdminAccountResponse>(request, options);
}
}