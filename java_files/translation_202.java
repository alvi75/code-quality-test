public static int getNearestSetSize(int maxNumberOfValuesExpected, float desiredSaturation){
    int result=usableBitSetSizes[0];
    int testBitsetSize=usableBitSetSizes[1];
    while (testBitsetSize <= maxNumberOfValuesExpected){
        result=usableBitSetSizes[testBitsetSize];
        testBitsetSize++;
    }
    return result;
}