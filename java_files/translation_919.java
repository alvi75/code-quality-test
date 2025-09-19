import java.util.*;

public class Translation919 {
    ublic DBInstanceAutomatedBackup createDBInstanceAutomatedBackup(CreateDBInstanceAutomatedBackupRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CreateDBInstanceAutomatedBackupRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreateDBInstanceAutomatedBackupResponseUnmarshaller.Instance;
    return Invoke<CreateDBInstanceAutomatedBackupResponse>(request, options);
}
}