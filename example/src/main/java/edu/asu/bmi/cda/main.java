package edu.asu.bmi.cda;
import edu.asu.bmi.cda.data.Patient;
/**
 * Hello world!
 *
 */
public class main
{
    public static void main( String[] args )
    {
    	Patient p1, p2, p3;
    	
    	
    	p2 = new Patient("p2", "Marcus Naymik", "24");
    	System.out.println(p2.name+' '+p2.age+' '+p2.id);
    	
    }
}
