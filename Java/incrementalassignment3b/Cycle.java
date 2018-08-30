package incrementalassignment3b;

public class Cycle {

}

class Unicycle extends Cycle {
    public void balance() {
        System.out.println("balance a unicycle");
    }
}

class Bicycle extends Cycle {
    public void balance() {
        System.out.println("lets balance a bicycle");
    }
}

class Tricycle extends Cycle {

}

class Assignment3 {
    public static void main(String[] args) {

        /*-----Upcast---*/

        Cycle[] cycle = new Cycle[3];
        cycle[0] = new Unicycle();
        cycle[1] = new Bicycle();
        cycle[2] = new Tricycle();
        /*for(int i = 0; i < 3; i++)
        {
            cycle[i].balance();
        }*/
        //Doesnt work because balance is not declared in the cycle class and when we upcast it calls super function too.

        /*----Downcast---*/

        Unicycle uni = (Unicycle) cycle[0];
        uni.balance();
        Bicycle bi = (Bicycle) cycle[1];
        bi.balance();
        Tricycle tri = (Tricycle) cycle[2];
        //tri.balance();     // Doesnt work because there is no method balance in tricycle class
    }

}