import java.util.*;

public class Translation358 {
    ublic StartRelationalDatabaseResponse StartRelationalDatabase(StartRelationalDatabaseRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = StartRelationalDatabaseRequestMarshaller.Instance;
    options.ResponseUnmarshaller = StartRelationalDatabaseResponseUnmarshaller.Instance;
    return Invoke<StartRelationalDatabaseResponse>(request, options);
}
}