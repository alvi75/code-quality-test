ublic override String toString(){
    StringBuilder buffer = new StringBuilder();
    buffer.Append("[SCENARIOPROTECT]\n");
    buffer.Append(" .protect = ").Append(Protect).Append("\n");
    buffer.Append("[/SCENARIOPROTECT]\n");
    return buffer.ToString();
}