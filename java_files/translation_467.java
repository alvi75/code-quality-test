ublic void setLength(int sz) {
    NB.encodeInt32(info, infoOffset + P_SIZE, sz);
}