import java.util.*;

public class Translation611 {
    ublic DisableOrganizationAdminAccountResponse DisableOrganizationAdminAccount(DisableOrganizationAdminAccountRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DisableOrganizationAdminAccountRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DisableOrganizationAdminAccountResponseUnmarshaller.Instance;
    return Invoke<DisableOrganizationAdminAccountResponse>(request, options);
}
}