public class Pegasus extends Monster {
    public Pegasus(String name) {
        super(name);
    }

    @Override
    public String attackByFire() {
        return canAttack.fire();
    }

    @Override
    public void setFire(Fireable fireable) {
        canAttack = fireable;
    }
}
