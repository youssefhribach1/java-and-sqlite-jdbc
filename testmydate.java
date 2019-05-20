package projet1;

public class testmydate {

	public static void main(String[] args) {

    Mydate date1=new Mydate(21,04,1997);
    Mydate date2=new Mydate(15,06,2015);
    Mydate date3=new Mydate(15,04,1007);
    Mydate date4=new Mydate(01,10,2005);
    
    String str1=date1.x();
    String str2=date2.x();
    String str3=date3.x();
    String str4=date4.x();
    
    System.out.println(str1);
    System.out.println(str2);
    System.out.println(str3);
    System.out.println(str4);
    
	}

}
