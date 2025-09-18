public static NumberRecord convertToNumberRecord(RKRecord rk) {
    NumberRecord num = new NumberRecord();
    num.setColumn((short)rk.getColumn());
    num.setRow((short)rk.getRow());
    num.setXFIndex(rk.getXFIndex());
    num.setValue(rk.getRKNumber());
    return num;
}