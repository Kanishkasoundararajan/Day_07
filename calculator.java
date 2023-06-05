package selenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class calculator {
	
	int num1=20;
	int num2=10;
  @Test(priority = 1)
  public void add() {
	  
	  int sum=num1+num2;
	  Assert.assertEquals(sum,30);
  }
  @Test(priority = 2)
  public void sub() {
	  
	  int subt=num1-num2;
	  Assert.assertEquals(subt,10);
  }
  @Test(priority = 3)
  public void mul() {
	  
	  int multi=num1*num2;
	  Assert.assertEquals(multi,200);
  }
  @Test(priority = 4)
  public void div() {
	  
	  int divi=num1/num2;
	  Assert.assertEquals(divi,2);
  }
}
