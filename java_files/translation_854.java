import java.util.*;

public class Translation854 {
    public DeleteQueueResult deleteQueue(String queueUrl) {
    request = new DeleteQueueRequest();
    request.queueUrl = queueUrl;
    return deleteQueue(request);
}
}