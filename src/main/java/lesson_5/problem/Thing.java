package lesson_5.problem;

public class Thing {

    private int id;
    private int weight;
    private int price;

    public Thing(int id, int weight, int price) {
        this.id = id;
        this.weight = weight;
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Thing{" +
                "id=" + id +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }
}
