public class BoxWeight extends Box {
    private float weight;

    public BoxWeight() {
        super();
        weight = 0;
    }

    public BoxWeight(float w, float h, float d, float m) {
        super(w, h, d);
        weight = m;
    }

    public BoxWeight(BoxWeight bw) {
        super(bw);
        this.weight = bw.weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void displayWeight() {
        System.out.println("Weight: " + weight);
    }
}
