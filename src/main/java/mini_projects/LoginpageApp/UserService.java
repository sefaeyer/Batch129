package mini_projects.LoginpageApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//5- User objesiyle ilgili islemler
public class UserService {
    //6-kullanici bilgileri tutmak icin list olusturalim.
    List<User> userList = new ArrayList<>();
    //tum metodlarda kullanicidan bilgi almak icin scanner objesi olustur
    Scanner inp=new Scanner(System.in);


    //7-username veya email ile kayitli user i getirmek icin bir metod olusturalim
    private User getUser(String userNameOrEmail){
        for(User user:userList){
            if(user.getUsername().equals(userNameOrEmail)){
                return user;
            }else if(user.getEmail().equals(userNameOrEmail)){
                return user;
            }
        }
        return null;
    }
    //8-email validation
    private static boolean validEmail(String email){
        boolean isValid;
        boolean isExistsSpace=email.contains(" ");
        boolean isContainsAt=email.contains("@");
        if(isExistsSpace){
            System.out.println("email bosluk iceremez.");
            isValid=false;
        }else if(!isContainsAt){
            System.out.println("email @ sembolunu icermelidir.");
            isValid=false;
        }else {
            String firstPart=email.split("@")[0];
            String secondPart=email.split("@")[1];

            boolean valid= firstPart.replaceAll("[a-zA-Z0-9_.-]","").isEmpty();
            boolean checkStart=valid && firstPart.length()>0;
            boolean checkEnd=secondPart.equals("gmail.com") ||
                    secondPart.equals("hotmail.com") ||
                    secondPart.equals("yahoo.com");
            if(!checkStart) {
                System.out.println("Mailin kullanıcı adı bölümü en az bir karakter içermelidir ve " +
                        "sadece küçük-büyük harf,rakam veya -._ içerebilir.");
            }
            if (!checkEnd){
                System.out.println("email gmail.com, hotmail.com veya yahoo.com ile bitmelidir!");
            }
            isValid=checkStart && checkEnd;
        }
        if(!isValid){
            System.out.println("Tekrar deneyiniz.");
        }
        return isValid;
    }
    //9-password validation
    private static boolean validatePassword(String password){//ASdf12*-
        boolean isValid;
        boolean isExistsSpace=password.contains(" ");
        boolean isLengthGThanSix=password.length()>=6;
        boolean isExistUpperLetter=password.replaceAll("[A-Z]","").length()>0;//AS
        boolean isExistLowerLetter=password.replaceAll("[a-z]","").length()>0;//df
        boolean isExistDigit=password.replaceAll("[\\D]","").length()>0;//12
        boolean isExistSymbol=password.replaceAll("[\\P{Punct}]","").length()>0;//*-
        if(isExistsSpace){
            System.out.println("Sifre bosluk iceremez");
        }else if(!isLengthGThanSix){
            System.out.println("Sifre en az 6 karakter icermelidir");
        }else if(!isExistUpperLetter){
            System.out.println("Sifre en az 1 tane buyuk harf icermelidir");
        }else if(!isExistLowerLetter){
            System.out.println("Sifre en az 1 tane kucuk harf icermelidir");
        }else if(!isExistDigit){
            System.out.println("Sifre en az 1 tane rakam icermelidir");
        }else if(!isExistSymbol){
            System.out.println("Sifre en az 1 tane sembol icermelidir");
        }
        isValid=!isExistsSpace && isExistUpperLetter && isExistLowerLetter && isExistDigit && isExistSymbol && isLengthGThanSix;

        if (!isValid){
            System.out.println("Geçersiz şifre, tekrar deneyiniz.");
        }

        return isValid;
    }

    public void register (){
        System.out.println("Ad-Soyad: ");
        String name=inp.nextLine();
//10- username unique/ essiz olmali
        String username=getUserName();
//11-email unique ve gecerli olmali
        String email=getEmail();
//12-password : gecerli olmali
        String password=getPassword();
//13-user objesini olusturalim
        User user=new User(name,username,email,password);
//14-user i listeye kaydedelim.
        this.userList.add(user);
        System.out.println("Tebrikler!.. Uye kaydi gerceklesti");
        System.out.println("Kullanici adi veya email ve sifrenizle sisteme giris yapabilirsiniz");


    }

//10-a) kullanicidan username alma
    private String getUserName(){
        String username;
        boolean existsUsername;
        do {
            System.out.println("Kullanici adi giriniz");
            username = inp.next();//bu username daha once kullanilmis mi?
            existsUsername=getUser(username)!=null;
            if(existsUsername){
                System.out.println("Bu username kullanilmis, farkli bir username deneyiniz");
            }
        }while (existsUsername);

        return username;
    }
//11-a- kullanicidan email alma
    private String getEmail(){
        String email;
        boolean isValid;
        boolean existsEmail;
        do{
            System.out.println("Lutfen email giriniz.");
            email=inp.next();//email gecerli mi : validation
            isValid =validEmail(email);//gecerli ise unique mi
            existsEmail=getUser(email)!=null;
            if(existsEmail){
                System.out.println("Bu email zaten kayitli, farkli bir email deneyiniz.");
                isValid=false;
            }

        }while (!isValid);

        return email;
    }

//12-a-password olusturma
    private String getPassword(){
        String passw;
        boolean isValidPassw;
        do{
            System.out.println("Sifrenizi giriniz");
            passw=inp.next();
            isValidPassw=validatePassword(passw);

        }while (!isValidPassw);

        return passw;
    }

//15-email veya username ile giris yapma
    public void login(){
        System.out.println("Lutfen kullanici adi veya email giriniz");
        String userNameOrEmail=inp.next();
        //16-girilen deger ile user i bulma
        if(getUser(userNameOrEmail)!=null) {
            User user = getUser(userNameOrEmail);
            //17-user bulunduysa sifre kontrolu
            boolean isWrong=true;
            while(isWrong){
                System.out.println("Sifrenizi giriniz:");
                String password=inp.next();
                //girilen sifre buldugumuz user in sifresiyle ayni mi?
                if(user.getPassword().equals(password)){
                    System.out.println("Sisteme hosgeldiniz.");
                    isWrong=false;
                }else{
                    System.out.println("Sifreniz yanlis, tekrar deneyiniz");
                }
            }
        }else{
            System.out.println("Sistemde kayitli kullanici adi veya email bulunamadi.");
            System.out.println("Uye iseniz bilgileriniz kontrol ederek tekrar deneyiniz, degilseniz lutfen uye olunuz.");
        }

    }
}
