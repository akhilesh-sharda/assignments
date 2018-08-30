package incrementalassignment3a;

class Main {
    public static void main(String[] args) {
        Rodent[] array = new Rodent[2];
        array[0] = new Mouse();
        array[1] = new Hamster();
        //Rodent r = new Rodent();
        //r.colorOfRodent();
        //r.sizeOfRodent();

        System.out.println(new Main());

        for (int i = 0; i < array.length; i++) {
            array[i].colorOfRodent();
            array[i].sizeOfRodent();
        }
    }

}

