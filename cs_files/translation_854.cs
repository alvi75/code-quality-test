using System;
using System.Collections.Generic;

public class Translation854
{
    public virtual DeleteQueueResponse DeleteQueue(string queueUrl){
    var request = new DeleteQueueRequest();
    request.QueueUrl = queueUrl;
    return DeleteQueue(request);
}
}