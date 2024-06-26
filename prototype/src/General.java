public class General extends GameUnit{

    private String state = "idle";

    public void boostMorale() {
        this.state = "MoralBoost";
    }

    @Override
    public void reset() {
        throw new UnsupportedOperationException("Reset not supported");
    }

    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Generals are unique");
    }

    @Override
    public String toString() {
        return "General{" +
                "state='" + state + '\'' +
                '}';
    }
}
