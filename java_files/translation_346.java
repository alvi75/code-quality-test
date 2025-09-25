import java.util.*;

public class Translation346 {
    public BasicSessionCredentials(String accessKeyId, String accessKeySecret,String sessionToken, long roleSessionDurationSeconds) {
    assert accessKeyId != null : "Access key ID cannot be null.";
    assert accessKeySecret != null : "Access key secret cannot be null.";
    this.accessKeyId = accessKeyId;
    this.accessKeySecret = accessKeySecret;
    this.sessionToken = sessionToken;
    this.roleSessionDurationSeconds = roleSessionDurationSeconds;
    sessionStartedTimeInMilliSeconds = System.currentTimeMillis();
}
}