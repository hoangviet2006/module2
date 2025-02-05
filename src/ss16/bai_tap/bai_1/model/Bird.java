package ss16.bai_tap.bai_1.model;

public class Bird {
    private int length;
    private int weight;
    private String name;

    public Bird() {
    }

    public Bird(int weight, String name, int height) {
        this.length = height;
        this.weight = weight;
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInforToFile() {
        return this.getWeight() + "," + this.getName() + "," + this.getLength();
    }

    @Override
    public String toString() {
        return "Bird{ " + "name: " + name + ", weight(g): " + weight + ", length(cm): " + length + " }";
    }
}
