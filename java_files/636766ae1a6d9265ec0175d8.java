import java.util.*;

public class Generated_636766ae1a6d9265ec0175d8 {
    private String buildContentRange(){
        if (mCount == 0 || mOffset < 0)
            return null;

        StringBuilder builder = new StringBuilder();
        builder.append("items ").append(mOffset).append("-").append((mLimit == 0 ? (mCount - 1) : mLimit - 1)).append("/").append(mCount);
        return builder.toString();
    }
}