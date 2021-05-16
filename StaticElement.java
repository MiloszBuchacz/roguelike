public class StaticElement extends Element {

    private int weight;
    private boolean isToxic;
    private boolean canPassThrough;

    public StaticElement(String look, int weight, int x, int y, boolean isToxic, boolean canPassThrough) {
        super(look, weight, x, y, isToxic);
    }

    public boolean getIsToxic() {
        return this.isToxic;
    }

    public boolean getPassThrough() {
        return this.canPassThrough;
    }

    public int getWeight() {
        return weight;
    }
}