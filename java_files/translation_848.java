ublic override void Write(byte[] b){
    WriteContinueIfRequired(b.Length);
    _ulrOutput.write(b);
}