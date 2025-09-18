public class Box {
    private float width;
    private float height;
    private float depth;

    public Box() {
        width = height = depth = 0;
    }

    public Box(float w, float h, float d) {
        width = w;
        height = h;
        depth = d;
    }

    public Box(Box b) {
        this.width = b.width;
        this.height = b.height;
        this.depth = b.depth;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getDepth() {
        return depth;
    }

    public void setDepth(float depth) {
        this.depth = depth;
    }

    public float volume() {
        return width * height * depth;
    }
}
