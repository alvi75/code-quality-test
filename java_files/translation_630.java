ublic override String toString(){
    StringBuilder buffer = new StringBuilder();
    buffer.Append("[BACKUP]\n");
    buffer.Append(" .backup = ").Append(StringUtil.toHexString(Backup)).Append("\n");
    buffer.Append("[/BACKUP]\n");
    return buffer.ToString();
}