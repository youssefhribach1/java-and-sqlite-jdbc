package projet1;

public class Mydate {
	int day;
	int month;
	int year;
	
	
	{
		day=21;
		month=4;
		year=1997;
	}
	
	// Constructor without parameters
	public Mydate() {
		
	}
	
	// Constructor with 3 parameters
	public Mydate(int d, int m,int y) {
	
		setDate(d,m,y);
	}

	
	//Methods
	
	public String x(){
		return day + "/" + month + "/" + year;
		}
		
	public void setDate(int d, int m, int y) {
	     day=d;
	     month=m;
	     year=y;
	}
	
	
}

