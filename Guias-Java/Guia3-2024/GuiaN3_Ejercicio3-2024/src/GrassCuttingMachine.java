public class GrassCuttingMachine implements ITurnOf, ITurnOn {
    @Override
    public String turnON() {
        return getClass() + "Turn On";
    }
    @Override
    public String turnOf() {
        return getClass() + "Turn Of";
    }
}
