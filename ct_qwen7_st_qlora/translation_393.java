import java.util.*;

public class Translation393 {
    public PostingsArray build() {
    assert state == State.ADD_DOCUMENT;
    finishBlock();
    if (1 + numBlocks == blocks.Length)growBlocks(2 * blocks.length);
    final PostingsArray result = new PostingsArray(blocks, offsets, lengths, nextID);
    Arrays.fill(lengths, numBlocks, lengths.length, 0);
    Arrays.fill(nextID, numBlocks, nextID.length, 0);
    blocks[numBlocks] = BlockPool.EMPTY_BLOCK;
    offsets[numBlocks] = blockPool.AllocBlock();
    nextID[numBlocks++] = 1;
    numBlocksUsed = numBlocks;
    state = State.RESET;
    assert okToReuse();
    return result;
}
}