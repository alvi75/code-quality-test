import java.util.*;

public class Translationtranslation_346 {
    public BasicSessionCredentials(String accessKeyId, String accessKeySecret,String sessionToken, java.util.Date expiration) {
        if (accessKeyId == null) {
            throw new IllegalArgumentException("Access key ID cannot be null.");
        }
        if (accessKeySecret == null) {
            throw new IllegalArgumentException("Access key secret cannot be null.");
        }
        if (sessionToken == null) {
            throw new IllegalArgumentException("Session token cannot be null.");
        }
        this.accessKeyId = accessKeyId;
        this.accessKeySecret = accessKeySecret;
        this.sessionToken = sessionToken;
        if (expiration == null) {
            this.refreshDate = new Date();
        }
        else {
            this.refreshDate = expiration;
        }
    }
}