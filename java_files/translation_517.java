public PushConnection openPush() throws NotSupportedException {
    throw new NotSupportedException(JGitText.get().pushIsNotSupportedForBundleTransport);
}