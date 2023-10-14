//Dizer se o numero digitado e primo ou não!
import java.util.Scanner; public class Primo{
    public static void main(String[] args) {
        Scanner dd=new Scanner(System.in);
       
        //0==48 | 1==49 | 2==50 | 3==51 | 4==52 | 9==57
        System.out.println("Digite um numero: ");
        String en=dd.next(); //12n4
        String com="";
        System.out.println("------------");

        for(;;){ //trava de segurança: apenas numeros!!!
            for(int i=0;en.length()>i;i++){
                char tr[]=en.toCharArray();
                if(tr[i]>=48 && tr[i]<=57){
                    com+=tr[i];// 12
                    System.out.println(com+"<-");
                    break;
                }if(tr[i]<48 && tr[i]>57){
                    System.out.println("Digite apenas numero!");
                    en=dd.next();//1234
                    System.out.println("-----");
                    break;
                }
            }            
            if((com.equals(en))){break;}
        } //fim da trave.
        System.out.println(en+"<- oque saiu da trava");// Errado: 12n4 | Correto:1234
        System.out.println(com+"<- valor de com");
       
      
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