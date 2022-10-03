package lesson_2;

public class Notebook {

    private double price;
    private int rum;
    private Brand brand;

    public enum Brand {
        Lenuvo,
        Asos,
        MacNote,
        Eser,
        Xamiou
    }

    public Notebook(double price, int rum, Enum brand) {
        this.price = price;
        this.rum = rum;
        this.brand = (Brand) brand;
    }

    public double getPrice() {
        return price;
    }

    public int getRum() {
        return rum;
    }

    public Brand getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "price=" + price +
                ", rum=" + rum +
                ", brand=" + brand +
                '}';
    }
}
