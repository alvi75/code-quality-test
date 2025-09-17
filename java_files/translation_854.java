import java.util.*;

public class Translationtranslation_854 {
    public DeleteQueueResult deleteQueue(String queueUrl) {
        return deleteQueue(new DeleteQueueRequest().withQueueUrl(queueUrl));
    }
}