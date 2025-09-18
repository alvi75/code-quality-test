public UnbufferedCharStream( int bufferSize ){
    this.bufferSize = bufferSize;
    this.data = new int[bufferSize];
}