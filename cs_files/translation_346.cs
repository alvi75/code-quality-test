using System;
using System.Collections.Generic;

public class Translation346
{
    public BasicSessionCredentials(string accessKeyId, string accessKeySecret, string sessionToken, long roleSessionDurationSeconds){
    if (accessKeyId == null){
        throw new ArgumentOutOfRangeException("Access key ID cannot be null.");
    }
    if (accessKeySecret == null){
        throw new ArgumentOutOfRangeException("Access key secret cannot be null.");
    }
    if (sessionToken == null){
        throw new ArgumentOutOfRangeException("Session token cannot be null.");
    }
    if (roleSessionDurationSeconds < 900 || roleSessionDurationSeconds > 3600){
        throw new ArgumentOutOfRangeException("Role session duration must be between 15min and 1Hr, got " + roleSessionDurationSeconds + "s");
    }
    this.accessKeyId = accessKeyId;
    this.accessKeySecret = accessKeySecret;
    this.sessionToken = sessionToken;
    this.roleSessionDurationSeconds = roleSessionDurationSeconds;
}
}