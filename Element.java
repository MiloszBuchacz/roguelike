public abstract class Element {

    private String look;
    private int weight;
    private int x;
    private int y;
    private boolean isToxic;
    private boolean isMoveable;
    

    public Element(String look, int weight, int x, int y, boolean isMoveable) {
        this.look = look;
        this.weight = weight;
        this.x = x;
        this.y = y;
        this.isMoveable = isMoveable;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
    public String getLook() {
        return this.look;
    }

    public void setY(int y) {
        this.y = this.y + y;
    }
    
    public void setX(int x) {
        this.x = this.x + x;
    }
    public void setIsMoveable() {
        this.isMoveable = true;
    }
}
