package incrementalassignment3d;


interface Cycle {
    void balance();
}

class Unicycle implements Cycle {
    @Override
    public void balance() {
        System.out.println("balancing unicycle");
    }
}

class Bicycle implements Cycle {
    @Override
    public void balance() {
        System.out.println("balancing bicycle");
    }
}

class Tricycle implements Cycle {
    @Override
    public void balance() {
        System.out.println("balancing tricycle");
    }
}

class CycleFactory {
    Cycle getCycle(String str) {
        if (str.equalsIgnoreCase("unicycle"))
            return new Unicycle();
        if (str.equalsIgnoreCase("bicycle"))
            return new Bicycle();
        if (str.equalsIgnoreCase("tricycle"))
            return new Tricycle();
        return null;
    }
}


public class FactoryDesign {
    public static void main(String[] args) {
        CycleFactory cf = new CycleFactory();
        Cycle c1 = cf.getCycle("unicycle");
        c1.balance();
        Cycle c2 = cf.getCycle("bicycle");
        c2.balance();
        Cycle c3 = cf.getCycle("tricycle");
        c3.balance();
    }
}
