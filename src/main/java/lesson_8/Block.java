package lesson_8;

import java.util.Date;

public class Block {

    int id;
    long timeStamp = new Date().getTime();
    private String hashPrevious;
    private String hash = StringUtil.applySha256(String.valueOf(Math.random()));

    public Block(int id, String hashPrevious) {
        this.id = id;
        this.hashPrevious = hashPrevious;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getHashPrevious() {
        return hashPrevious;
    }

    public void setHashPrevious(String hashPrevious) {
        this.hashPrevious = hashPrevious;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    @Override
    public String toString() {
        return "Block:\n" +
                "Id: " + id + "\n" +
                "Timestamp: " + timeStamp + "\n" +
                "Hash of the previous block: \n" +
                hashPrevious + "\n" +
                "Hash of the block: \n" +
                hash + "\n";
    }
}

