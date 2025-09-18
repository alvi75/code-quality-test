public void add(FieldInfos other) {
    assert assertNotFinished();
    for(FieldInfo fieldInfo : other){
        add(fieldInfo);
    }
}