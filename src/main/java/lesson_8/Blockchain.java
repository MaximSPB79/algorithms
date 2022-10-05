package lesson_8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Blockchain {

    private static final Map<Integer, String> idHash = new TreeMap<>();
    private static final List<Block> blockList = new ArrayList<>();
    private static Block block;


    public static void blockGeneration(int amount) {
        for (int i = 1; i < amount + 1; i++) {
            if (i == 1) {
                block = new Block(1, "0");
            } else {
                block = new Block(i, idHash.get(i - 1));
            }
            idHash.put(block.getId(), block.getHash());
            blockList.add(block);
        }
        blockList.forEach(System.out::println);
    }

    public static boolean blockCheck() {
        for (int i = 1; i < blockList.size(); i++) {
            return blockList.get(i).getHashPrevious().equals(blockList.get(i - 1).getHash());
        }
        return false;
    }
}
