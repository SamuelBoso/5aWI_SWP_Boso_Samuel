package Bos.example.cars.car_extended;

public class Producer {
    private String ProducerName;
    private String country;
    private Double discount;

    public Producer(String producerName, String country, Double discount) {
        ProducerName = producerName;
        this.country = country;
        this.discount = discount;
    }

    public Double getDiscount() {
        return discount;
    }
}
