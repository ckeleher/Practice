import java.util.*;


public class simpleIO{

    public static void main(String[] ars){
        
        ArrayList kek = new ArrayList();
        
        Scanner sc = new Scanner(System.in);
        
        while(true){
            int i= sc.nextInt();
            kek.add(i);
            if(kek.size() >= 10) break;
        }
        
        System.out.println("kek should have 10 elements now");
        System.out.println(kek);
    }
}
        