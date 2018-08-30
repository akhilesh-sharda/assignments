package incrementalassignment2;

class RestOfTheQuestions {

    static class ConstructorOverload {
        private int x;

        public ConstructorOverload() {
            this(1);
        }

        public ConstructorOverload(int x) {
            this.x = x;
            //System.out.println(x);
        }
    }

    static class StringConstructor{
        public StringConstructor(String msg){
            System.out.println(msg);
        }
    }

    public static void main(String[] args) {
        //Question 2b - calling parametrized constructor from within default constructor
        ConstructorOverload co = new ConstructorOverload();

        //Question 2c - creatng an array of object but not initislizing
        //nothing is printed, constructor isnt called until object is initialized
        StringConstructor[] sc = new StringConstructor[5];

        //Question 2d- initializing the earlier class
        //"hey" is printed for each instance
        for(int i = 0; i < 5; i++)
        {
            sc[i] = new StringConstructor("hey");
        }

    }
}
