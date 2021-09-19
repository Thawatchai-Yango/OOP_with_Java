public abstract class Monster {
    protected String name;
    protected Fireable canAttack;

    public Monster(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String attackByFire();
    public abstract void setFire(Fireable fireable);

}
