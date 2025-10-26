import java.util.*;

public class Translation854 {
    ublic DeleteQueueResponse deleteQueue(String queueUrl) {
    DeleteQueueRequest request = new DeleteQueueRequest();
    request.setQueueUrl(queueUrl);
    return deleteQueue(request);
}
}