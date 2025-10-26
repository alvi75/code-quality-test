ublic override ValueEval Evaluate(int srcRowIndex, int srcColumnIndex, ValueEval inumberVE){
    ValueEval veText1;
    try{
        veText1 = OperandResolver.GetSingleValue(inumberVE, srcRowIndex, srcColumnIndex);
    }
    catch (EvaluationException e){
        return e.GetErrorEval();
    }
    String iNumber = OperandResolver.CoerceValueToString(veText1);
    System.Text.RegularExpressions.Match m = COMPLEX_NUMBER_PATTERN.Match(iNumber);
    bool result = m.Success && m.Groups[0].Length > 0;
    String imaginary = "";
    if (result == true){
        String imaginaryGroup = m.Groups[5].Value;
        bool hasImaginaryPart = imaginaryGroup.Equals("i") || imaginaryGroup.Equals("j");
        if (imaginaryGroup.Length == 0){
            return new StringEval(Convert.ToString(0));
        }
        if (hasImaginaryPart){
            String sign = "";
            String imaginarySign = m.Groups[(GROUP3_IMAGINARY_SIGN)].Value;
            if (imaginarySign.Length != 0 && !(imaginarySign.Equals("+"))){
                sign = imaginarySign;
            }
            String groupImaginaryNumber = m.Groups[(GROUP4_IMAGINARY_INTEGER_OR_DOUBLE)].Value;
            if (groupImaginaryNumber.Length != 0){
                imaginary = sign + groupImaginaryNumber;
            }
            else{
                imaginary = sign + "1";
            }
        }
    }
    else{
        return ErrorEval.NUM_ERROR;
    }
    return new StringEval(imaginary);
}