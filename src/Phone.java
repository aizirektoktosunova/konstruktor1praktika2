public class Phone {
    private String color;
    private String name;

    public Phone() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Phone(String color, String name) {
        this.color = color;
        this.name = name;

    }
}
