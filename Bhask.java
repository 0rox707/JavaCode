// Ainda esta incompleto  
import java.util.Scanner;public class Bhask{
    
    public static void main(String[] args) {
        int Rep=1;
        long X1,X2;
        for(;Rep==1;){

            System.out.println("Bhaskara\n_______________________");
            System.out.println("Quer ver a equação base?\n1)-Sim\n2)-Não");
            int r = new Scanner(System.in).nextInt();
            System.out.println("=-=-=-=--=-=-=-=-=-=-=-=-=-=-=");
                if(r==1){
                   System.out.println("A equação base é \nax²+bx+c");
                   System.out.println("---------------------------");                    
                    }
                       long a,b,c;
                    System.out.print("Valor de 'a':");
                    a=new Scanner(System.in).nextLong();

                    System.out.print("Valor de 'b':");
                    b=new Scanner(System.in).nextLong();

                    System.out.print("Valor de 'c':");
                    c=new Scanner(System.in).nextLong();

                    System.out.println("________________\nA equação fica: "+a+"x²+"+b+"x+"+c);
                    System.out.println(" ==========\n   DELTA\n ==========");
                    double D;

                    D=Math.pow(b, 2)-4*a*c;
                    System.out.println("Delta e \nD="+b+"²-4*"+a+"*"+c+" = "+D); 
                    System.out.println(" ===-==-==-==-===\n   BHASKARA\n ===-==-==-==-==="); 
                    System.out.println("x=(-b+-|D)/2*a\n================\n");
                    double x1,x2;

                    switch((D>0)?1:(D==0)?2:3){
                        case 1:{
                            System.out.println("x=-"+b+"+-|"+(long)D+"/2*"+a);
                            x1=(-b+(Math.sqrt((long)D/2)));
                            x2=(-b-(Math.sqrt((long)D))/2);
                            System.out.println("x1="+x1);
                            System.out.println("x2="+x2);
                            X1=(long)x1; 
                            X2=(long)x2;                       
                        }
                        case 2:{
                            System.out.println("x=-"+b+"+-|"+D+"/2*"+a);
                            x1=(-b+Math.sqrt((long)D/2));
                            System.out.println("x1 = x2 ="+D);
                            break;
                        }
                        default:{
                            System.out.println("Raiz negativa não existe nos numeros reais!\n-----------");}
                        }                                               
                        /*System.out.println("Gostaria de verifivar a equação?");
                        String Re=new Scanner(System.in).next();
                        switch(Re=="Sim"||Re=="sin"||Re=="s"?1:Re=="Não"||Re=="não"||Re=="Nao"||Re=="nao"||Re=="n"?2:3){
                            case 1:
                                System.out.println();

                            case 2:*/


                        }
                    
         System.out.println("Gostaria de continuar: \n1");
         Rep=new Scanner(System.in).nextInt();
        
        
    }
}
