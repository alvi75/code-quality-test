ublic Object get(String key) {
    int bucket = normalCompletion.getBucket(key);
    return bucket == -1 ? null : bucket;
}