import java.util.*;

public class Translation854 {
    public DeleteQueueResult deleteQueue(String queueUrl) {
    final DeleteQueueRequest request = new DeleteQueueRequest();
    request.setQueueUrl(queueUrl);
    return deleteQueue(request);
}
}