import java.util.*;

public class Translation22 {
    public TagQueueResult deleteMessageQueue(DeleteDirectQueueQueueRequest request) {
    request = beforeClientExecution(request);
    return executeDeleteMessageQueue(request);
}
}