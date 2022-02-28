public class Hesap {
    private String Kullanıcı_adı;
    private String parola;
    private int bakiye;

    public void  paraÇekme(int miktar){
         
        if(bakiye-miktar<0){
            System.out.println("bakiyeniz yetersiz. şuanki bakiyeniz : " +bakiye ); 
        }
        else if(miktar>1500){
            System.out.println("günde 1500 tl den fazla para çekemssiniz. bakiyeniz :"+ bakiye);
    }    else{
             System.out.println("Kalan bakiyeniz : "+ (bakiye-miktar));
        }
}    
    public void paraYatırma(int miktar){
        bakiye +=miktar;
        System.out.println("bakiyeniz: " + bakiye);
    }
      
    public Hesap(String Kullanıcı_adı, String parola, int bakiye) {
        this.Kullanıcı_adı = Kullanıcı_adı;
        this.parola = parola;
        this.bakiye = bakiye;
    }
    public String getKullanıcı_adı() {
        return Kullanıcı_adı;
    }
    public void setKullanıcı_adı(String Kullanıcı_adı) {
        this.Kullanıcı_adı = Kullanıcı_adı;
    }
    public String getParola() {
        return parola;
    }
    public void setParola(String parola) {
        this.parola = parola;
    }
    public int getBakiye() {
        return bakiye;
    }
    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
    
}
