import java.util.*;

public class Translation854 {
    public DeleteQueueResult deleteQueue(String queueUrl) {
    return deleteQueue(new DeleteQueueRequest().withQueueUrl(queueUrl));
}
}