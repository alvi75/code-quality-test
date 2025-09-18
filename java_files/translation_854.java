public DeleteQueueResult deleteQueue(String queueUrl) {
    return deleteQueue(new DeleteQueueRequest().withQueueUrl(queueUrl));
}