package akhilesh.assignment.data;

public class First
{
   int abc1;
   char xyz1;

   public void print1()
   {
	System.out.println(abc1);
	System.out.println(xyz1);
   }

   public void print2()
   {
   	int abc2;
	char xyz2;
	/*
	System.out.println(abc2);
	System.out.println(xyz2);
	*/
	// This is not possible in java because while compile time we will get an error saying the variables might not have been initialized.
   }
}
