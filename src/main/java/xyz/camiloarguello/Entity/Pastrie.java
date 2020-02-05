package xyz.camiloarguello.Entity;

public class Pastrie {

    private int id;
    private String name;
    private String type;
    private String image;
    private int price;
    private String description;

    // Constructors

    public Pastrie(int id, String name, String type, String image, int price, String description) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.image = image;
        this.price = price;
        this.description = description;
    }

    public Pastrie() {}

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() { return image; }

    public void setImage(String image) { this.image = image; }

    public int getPrice() { return price; }

    public void setPrice(int price) { this.price = price; }

    public void setDescription(String description) {
        this.description = description;
    }
}
