import java.util.*;

public class Translation32 {
    ublic AssociateSigninDelegateGroupsWithAccountResponse AssociateSigninDelegateGroupsWithAccount(AssociateSigninDelegateGroupsWithAccountRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = AssociateSigninDelegateGroupsWithAccountRequestMarshaller.Instance;
    options.ResponseUnmarshaller = AssociateSigninDelegateGroupsWithAccountResponseUnmarshaller.Instance;
    return Invoke<AssociateSigninDelegateGroupsWithAccountResponse>(request, options);
}
}