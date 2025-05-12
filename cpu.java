import java.util.*;
public class cpu {
    int price;
    Scanner sc=new Scanner(System.in);
    cpu(){
    System.out.println("Enter price: ");
    
    this.price=sc.nextInt();
    }
    class Processor{
        int cores;
        String man;
        Processor(){

        
        System.out.println("Enter cores: ");
        this.cores=sc.nextInt();
        System.out.println("Enter manufacturer: ");
        this.man=sc.next();
        }
        static class RAM{
            int memory;
            String manufact;
            Scanner sc=new Scanner(System.in);
            RAM(){
                System.out.println("Enter memory: ");
                this.memory=sc.nextInt();
                System.out.println("Enter manufacturer: ");
                this.manufact=sc.next();
            }
        }
    }
    public static void main(String[] args) {
        cpu c=new cpu();
        cpu.Processor p = c.new Processor();  // Non-static inner class
        cpu.Processor.RAM r = new cpu.Processor.RAM();  // Static nested class
        c.price=(p.cores*100)+(r.memory);
        System.out.println("");
        System.out.println("Cores: "+p.cores +"Manufacturer :" +p.man);
        System.out.println("memory: "+r.memory + "Manufacturer :" +r.manufact);
              System.out.println(c.price);
    }

}
