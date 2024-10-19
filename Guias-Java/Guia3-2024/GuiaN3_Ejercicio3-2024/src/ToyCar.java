public class ToyCar implements ITurnOf, ITurnOn, IAccelerate {
    @Override
    public String turnON() {
        return getClass()+ " turn on";
    }
    @Override
    public String turnOf() {
        return getClass() + " turn of";
    }
    @Override
    public String accelerate() {
        return getClass() + " accelerte";
    }
}
