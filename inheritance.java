package projet1;

import java.util.Calendar;

public class inheritance {

private String firsname;
private String lastname;

int dob;

public String getfirstname(String firstname){
	return firstname;
}

public String getlastname(String lastname){
	return lastname;
}

public int getage(){
  int year=Calendar.getInstance().get(Calendar.YEAR);
  int age=year-this.dob;
  return age;
}


}
