import java.util.*;

public class Translation346 {
    public BasicSessionCredentials(String accessKeyId, String accessKeySecret,String sessionToken, Long roleSessionDurationSeconds) {
    if (accessKeyId == null) {
        throw new IllegalArgumentException("Access key ID cannot be null.");
    }
    if (accessKeySecret == null) {
        throw new IllegalArgumentException("Access key secret cannot be null.");
    }
    this.accessKeyId = accessKeyId;
    this.accessKeySecret = accessKeySecret;
    this.sessionToken = sessionToken;
    this.roleSessionDurationSeconds = roleSessionDurationSeconds;
    sessionStartedTimeInMilliSeconds = System.currentTimeMillis();
}
}