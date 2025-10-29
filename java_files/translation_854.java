import java.util.*;

public class Translation854 {
    01 public DeleteQueueResult deleteQueue(String queueUrl) {
    DeleteQueueRequest request = new DeleteQueueRequest();
    request.setQueueUrl(queueUrl);
    return deleteQueue(request);
}
}