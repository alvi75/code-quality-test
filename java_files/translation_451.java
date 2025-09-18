public void clear() {
    hash = hashTable.clear();
    hash = hashTable.makeRoomLRU();
}