public int indexOfKey(int key) {
    return binarySearch(mKeys, 0, mSize, key);
}