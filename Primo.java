//Dizer se o numero digitado e primo ou não!
import java.util.Scanner; public class Primo{
    public static void main(String[] args) {
        System.out.println("Digite um numero: ");
        String en=new Scanner(System.in).next();

        int i,nu,nr,cont;
        nu= Integer.parseInt(en);
        nr=0;
        cont=0;

        System.out.println("--------------");
        for(i=1;i<=100;i++){
            nr++;
            if(nu%i==0){
                cont++;
                if(cont==nu)
                break;
            }
        }
        if(cont<=2 || nu==1 || nu==2 || nu==3){
            System.out.println(nu+" e primo");}
        else{
            System.out.println(nu+" não primo.");}

        
        }
}