import static org.mockito.Mockito.*;
import static org.mockito.BDDMockito.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

// @RunWith attaches a runner with the test class to initialize the test data
@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTester {

	   private MathApplication mathApplication;
	   private CalculatorService calcService;

	   @Before
	   public void setUp(){
	      mathApplication = new MathApplication();
	      calcService = mock(CalculatorService.class);
	      mathApplication.setCalculatorService(calcService);
	   }
   @Test
   public void testAdd(){
	   //add the behavior to add numbers
	      when(calcService.add(20.0,10.0)).thenReturn(30.0);
	      

	      //subtract the behavior to subtract numbers
	      when(calcService.subtract(20.0,10.0)).thenReturn(10.0);

	      //test the subtract functionality
	      Assert.assertEquals(mathApplication.subtract(20.0, 10.0),10.0,0);

	      //test the add functionality
	      Assert.assertEquals(mathApplication.add(20.0, 10.0),30.0,0);
	      Assert.assertEquals(mathApplication.add(20.0, 10.0),30.0,0);
	      Assert.assertEquals(mathApplication.add(20.0, 10.0),30.0,0);

	      //verify call to calcService is made or not
	    
	      verify(calcService, times(3)).add(20.0, 10.0);
   }
   @Test
   public void testAddd(){

	   //Given
	      given(calcService.add(20.0,10.0)).willReturn(30.0);

	      //when
	      double result = calcService.add(20.0,10.0);

	      //then
	      Assert.assertEquals(result,30.0,0);  
	   }
	
   
   @Test
   public void testOrder() {
	   //add the behavior to add numbers
	   when(calcService.add(20.0,10.0)).thenReturn(30.0);
	      when(calcService.subtract(20.0,10.0)).thenReturn(10.0);
	      Assert.assertEquals(mathApplication.add(20.0, 10.0),30.0,0);
	      Assert.assertEquals(mathApplication.subtract(20.0, 10.0),10.0,0);
	      
	      //test the subtract functionality
	      
	      //create an inOrder verifier for a single mock
	      InOrder inOrder = inOrder(calcService);
	      inOrder.verify(calcService).add(20.0,10.0);
	      inOrder.verify(calcService).subtract(20.0,10.0);
	      //following will make sure that add is first called then subtract is called.
	    
	    
   }
   @Test
   public void testAddAndSubtract(){

      //add the behavior to add numbers
      when(calcService.add(20.0,10.0)).thenReturn(30.0);

      //subtract the behavior to subtract numbers
      when(calcService.subtract(20.0,10.0)).thenReturn(10.0);

      //test the subtract functionality
     
      Assert.assertEquals(mathApplication.subtract(20.0, 10.0),10.0,0);

      //test the add functionality
      Assert.assertEquals(mathApplication.add(20.0, 10.0),30.0,0);

      //verify call to add method to be completed within 100 ms
      verify(calcService, timeout(100)).add(20.0,10.0);
	  
      //invocation count can be added to ensure multiplication invocations
      //can be checked within given timeframe
      verify(calcService, timeout(1).times(1)).subtract(20.0,10.0);
   }
	      
}