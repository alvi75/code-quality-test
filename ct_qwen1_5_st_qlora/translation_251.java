import java.util.*;

public class Translation251 {
    public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval inumberVE) {
    ValueEval veText1;
    try {
        veText1 = OperandResolver.getSingleValue(inumberVE, srcRowIndex, srcColumnIndex);
    }
    catch (EvaluationException e) {
        return e.getErrorEval();
    }
    String iNumber = OperandResolver.coerceValueToString(veText1);
    Pattern complexNumberPattern = Pattern.compile("^-?([0-9]+)(\\.\\d+)?([eE][+-]?\\d+)?$");
    Matcher m = complexNumberPattern.matcher(iNumber);
    boolean result = m.matches()&&m.groupCount()>0;
    m.find();
    String imaginary = "";
    if(result==true){
        String imaginaryGroup = m.group(GROUP3_IMAGINARY_SIGN);
        boolean hasImaginaryPart = imaginaryGroup.equals("+")||imaginaryGroup.equals("-");
        if(imaginaryGroup.length()==0)return new StringEval("0");
        if(hasImaginaryPart){
            String sign = "";
            String imaginarySign = m.group(GROUP4_IMAGINARY_INTEGER_OR_DOUBLE);
            if(imaginarySign.length()!=0&&!imaginarySign.equals("+")){
                sign = imaginarySign;
            }
            String groupImaginaryNumber = m.group(GROUP4_IMAGINARY_INTEGER_OR_DOUBLE);
            if(groupImaginaryNumber.length()!=0){
                imaginary = sign+groupImaginaryNumber;
            }
            else{
                imaginary = sign+"1";
            }
        }
    }
    else{
        return ErrorEval.NUM_ERROR;
    }
    return new StringEval(imaginary);
}
}