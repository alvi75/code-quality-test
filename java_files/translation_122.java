import java.util.*;

public class Translation122 {
    public CancelUpdateStack(CancelUpdateStackRequest request) {
    base.CreateRequest(request, HttpMethod.Post, "opsworks", "2013-02-15", "CancelUpdateStack");
    UriPattern = "/stacks/{
        StackId}
        /cancel_update";
        UriResourcePath = "/{
            StackId}
            ";
            RequestMarshaller = CancelUpdateStackRequestMarshaller.Instance;
            ResponseUnmarshaller = CancelUpdateStackResponseUnmarshaller.Instance;
        }
}