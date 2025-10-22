import java.util.*;

public class Translation854 {
    ublic DeleteQueueResult deleteQueue(String queueUrl) {
    return deleteQueue(new DeleteQueueRequest().withQueueUrl(queueUrl));
}
}