import java.util.*;

public class Translation854 {
    ublic Queue deleteQueue(String queueUrl) {
    return deleteQueue(new DeleteQueueRequest().withQueueUrl(queueUrl));
}
}