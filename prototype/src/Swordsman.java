public class Swordsman extends GameUnit{
    private String state = "Idle";

    public void attack(){
        this.state = "attacking";
    }

    @Override
    public void reset() {
        this.state = "Idle";
    }

    @Override
    public String toString() {
        return "Swordsman{" +
                "state='" + state + '\'' +
                "Position='" + this.getPosition().toString()+ '\'' +
                '}';
    }
}
