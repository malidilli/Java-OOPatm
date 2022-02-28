import java.util.Scanner;
public class Login {
   public boolean Login(Hesap hesap){
       Scanner klavye=new Scanner(System.in);
       System.out.println("kullanıcı adınızı giriniz");
     String kullanıcı_adı=klavye.nextLine();
       System.out.println("parolanızı giriniz");
     String parola=klavye.nextLine();
     if(hesap.getKullanıcı_adı().equals(kullanıcı_adı) && hesap.getParola().equals(parola)){
           return true;
     }else{
         return false;
     }
   }
    
}
