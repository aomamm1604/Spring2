package web;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {
		
	@RequestMapping("/")
	String index() {
		return "Hello World!";
	}
        
        @RequestMapping("/area")
        double area(double radius)          
        {
            return Math.PI * radius *radius;
        }
        @RequestMapping("/vat/{price}")
        double vat(@PathVariable double price) 
        {
            return (price * 7)/100;
        }
        
        @RequestMapping("/zipcode/{d}")
        String zipcode(@PathVariable String d) 
        {
            String zipcode = " ";
            if(d.equals("เมืองนนทบุรี"))
                zipcode = "11000";
            else
               if(d.equals("บางบัวทอง"))
                 zipcode = "11110";
            else
               if(d.equals("ปากเกร็ด"))
                 zipcode = "11120";
            else
               if(d.equals("บางกรวย"))
                 zipcode = "11130";
            else
               if(d.equals("บางใหญ่"))
                 zipcode = "11140";
            else
               if(d.equals("ไทรน้อย"))
                 zipcode = "11150"; 
            return zipcode;
        }
        
        @RequestMapping("/car-tax/{cc}/{seat}")
        double calculate(@PathVariable int cc, @PathVariable int seat) 
        {

               return (cc*0.75)+(seat*70);
        }
   
        @RequestMapping("/interest/{balance}")
        double calculate(@PathVariable double balance) //another annoation
        {
            return balance * 1.25 / 100;
        }
        
        @RequestMapping("/walk/{w}")
        int calculate(@PathVariable String w) //another annoation
        {
            int x=0,y=0;
            int pta;
        
        for(int i=0;i< w.length();i++)
        {
            String cut = w.substring(i,i+1);
            if(cut.equals("N"))
                x++;
             else
            if(cut.equals("S"))
                x--;
            else
            if(cut.equals("E"))
                 y++;
            else
            if(cut.equals("W"))
                y--;   
           
        }
           pta = ( (Double)Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2)) ).intValue();
            return pta;
        }
        
        


}
