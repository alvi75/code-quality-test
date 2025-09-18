public int findEndOffset(StringBuilder buffer, int start) {
    if( start > buffer.length() || start < 0 ) return start;
    int offset, count = maxScan;
    for( offset = start;
    offset >= 0 && count > 0;
    count-- ){
        if( boundaryChars.contains( buffer.charAt( offset ) ) ) return offset;
        offset--;
    }
    return start;
}