import java.util.*;

public class Translation346 {
    1 public BasicSessionCredentials(String accessKeyId, String accessKeySecret,String sessionToken, long roleSessionDurationSeconds) {
    2 if (accessKeyId == null) {
        3 throw new IllegalArgumentException("Access key ID cannot be null.");
        4 }
        5 if (accessKeySecret == null) {
            6 throw new IllegalArgumentException("Access key secret cannot be null.");
            7 }
            8 this.accessKeyId = accessKeyId;
            9 this.accessKeySecret = accessKeySecret;
            10 this.sessionToken = sessionToken;
            11 this.roleSessionDurationSeconds = roleSessionDurationSeconds;
            12 sessionStartedTimeInMillis = System.currentTimeMillis();
        }
}