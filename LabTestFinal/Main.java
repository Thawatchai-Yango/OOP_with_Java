import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Monster> monsters = new ArrayList<>();
        Dragon p1= new Dragon ("Red Dragon");
        FireByFire  fire1 = new FireByFire();
        NoFire  fire2 = new NoFire();
        p1.setFire(fire1); //create an instance of  FireByFire
        Dragon p2= new Dragon("Blue Dragon");
        p2.setFire(fire1);  //create an instance of FireByFire
        Pegasus p3 = new Pegasus("Pegasus");
        p3.setFire(fire2);
        monsters.add(p1);  monsters.add(p2);  monsters.add(p3);
        try {
            for(var e:monsters) {
                System.out.println( e.getName() + ", " + e.attackByFire());
            }
        }
        catch( Exception ex) {
            System.out.println(ex);
        }

    }
}
