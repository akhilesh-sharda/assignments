package akhilesh.assignment.main;
import akhilesh.assignment.data.First;
import akhilesh.assignment.singleton.Second;

public class Main
{
   public static void main(String[] args)
   {
   	First obj1 = new First();
   	obj1.print1();
   	obj1.print2();
   	Second obj2 = Second.init("Akhilesh");
   	obj2.printstr();
   }
}
