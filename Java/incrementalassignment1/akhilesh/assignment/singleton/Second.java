package akhilesh.assignment.singleton;

public class Second
{
    String str;
    public static Second init(String s)
    {
	//this.str = s;
	Second obj2 = new Second();
	obj2.str = s;
	return obj2;
    }
    
    public void printstr()
    {
  	System.out.println(str);
    }

}
