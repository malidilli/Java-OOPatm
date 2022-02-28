import java.util.Scanner;

public class ATM {
    public void çalış(Hesap hesap){
        
        Login login=new Login();
        Scanner klavye=new Scanner(System.in);
        System.out.println("Bankamıza hoşgeldiniz.");
        System.out.println("***********************");
         int giriş_hakkı=3;
         while(true){
             if(login.Login(hesap)){
                 System.out.println("giriş başarılı");
                 break;
             }else{
                 System.out.println("giriş başarısız");
                 giriş_hakkı -=1;
                 System.out.println("kalan giriş hakkı : "+giriş_hakkı);
             }if(giriş_hakkı==0){
                 System.out.println("giriş hakkınız bitmiştir.");
                 return;
             }
         }
      System.out.println("********************");
      String işlemler="1.bakiye görüntüle"+"2.para yatırma" +"3.para Çekme"+"çıkış için q ya basınız";
        System.out.println("1.bakiye görüntüle\n"+"2.para çekme\n" +"3.para yatırma\n"+"çıkış için q ya basınız");
        while(true){
            System.out.println("işleminizi seçin");
            String işlem=klavye.nextLine();
            if(işlem.equals("1")){
                System.out.println("bakiyeniz :" + hesap.getBakiye());
               
            }else if(işlem.equals("2")){
                System.out.print("yatırmak istediginiz tutarı giriniz :");
                int tutar=klavye.nextInt();
                klavye.nextLine();
                hesap.paraYatırma(tutar);
            }else if(işlem.equals("3")){
                System.out.println("çekmek histediginiz tutarı giriniz.");
                int tutar=klavye.nextInt();
                klavye.nextLine();
                hesap.paraÇekme(tutar);
            }else if(işlem.equals("q")){
                System.out.println("çıkış yapılıyor");
                break;
        }  else {
                System.out.println("geçersiz işlem yaptınız");
            }
        }
       
    } 
   
}
