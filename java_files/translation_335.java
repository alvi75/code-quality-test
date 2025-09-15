import java.util.*;

public class Translationtranslation_335 {
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("[CFRULE]\n");
        buffer.append(" .cfRuleType =").append(HexDump.shortToHex(_cfRuleType)).append("\n");
        buffer.append(" .cfRuleStatus =").append(HexDump.shortToHex(_cfRuleStatus)).append("\n");
        buffer.append(" .cfRuleId =").append(HexDump.intToHex(_cfRuleId)).append("\n");
        buffer.append(" .cfmintrst =").append(HexDump.intToHex(_cfmintrst)).append("\n");
        buffer.append(" .maxintragroup =").append(HexDump.shortToHex(maxIntegrations)).append("\n");
        buffer.append(" .showintegrazione =").append(HexDump.byteToHex(_showIntegrations)).append("\n");
        buffer.append(" .numintegrazione =").append(HexDump.shortToHex(_numIntegrations)).append("\n");
        buffer.append("[/CFRULE]\n");
        return buffer.toString();
    }
}