import java.util.*;

public class Translation230 {
    public BatchRefUpdate addCommand(ReceiveCommand... cmd) {
    for (int i = 0;
    i < cmd.length;
    i++)addCommand(cmd[i]);
    return this;
}
}