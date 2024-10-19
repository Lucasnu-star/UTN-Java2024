public class Horse implements IMontaPersonas, IMontaCarga{
    @Override
    public String montaCarga() {
        return getClass() + " monta carga.";
    }
    @Override
    public String montaPersonas() {
        return getClass() + " monta persona.";
    }
}
