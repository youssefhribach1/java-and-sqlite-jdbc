package projet1;

public class track extends basic_class{
 private boolean hastrack;
 
 
    @Override
	double getprice() {
	     double newprice=price-(milesdrive*1);
	     return newprice;
	}
	
    void sethastrack(boolean hastrack) {
    	this.hastrack=hastrack;
    }
    
    
    double getpr() {
    return super.getprice();
    }
}
