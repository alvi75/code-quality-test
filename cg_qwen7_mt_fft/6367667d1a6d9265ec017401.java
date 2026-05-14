import java.util.*;

public class Generated_6367667d1a6d9265ec017401 {
    public static String unescapeJava(String str)
    {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if (ch == '\\')
            {
                // Escape character found, process next character
                i++;
                int nCharsToBeReplaced = 2;
                switch(str.charAt(i))
                {
                    case 'b':   sb.append('\b');     break;
                    case 't':   sb.append('\t');     break;
                    case 'n':   sb.append('\n');     break);
                    case 'f':   sb.append('\f');     break);
                    case 'r':   sb.append('\r');     break);
                    case '\'':  sb.append('\'');     break);
                    case '\"':  sb.append('\"');     break);
                    case '\\':  sb.append('\\');     break);
                    default:
                        boolean isOctal = false;
                        long octalValue = 0L;
                        try
                        {
                            octalValue = Long.parseLong(str.substring(i+1,i+3),8);
                            isOctal = true;
                        }
                        catch(NumberFormatException ex)
                        {
                            // Not an Octal escape sequence.
                            sb.append('\\');
                            sb.append(str.charAt(i));
                            continue;
                        }

                        if(isOctal && octalValue <= 0xFF)
                        {
                            sb.append((char)octalValue);
                            i += 2;
                        }
                        else
                        {
                            sb.append('\\');
                            sb.append(str.charAt(i));
                            i++;
                        }
                        break;
                }//end of switch

            }//end of if
            else
            {
                sb.append(ch);
            }
        }//end of for loop

        return sb.toString();

    }
}