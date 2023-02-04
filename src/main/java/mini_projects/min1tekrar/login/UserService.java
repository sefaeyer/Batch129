package mini_projects.min1tekrar.login;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {

    List<String> usernameList = new ArrayList<>();
    List<String> emailList = new ArrayList<>();
    List<String> passwordList = new ArrayList<>();

    public void showMenu() {
        System.out.println("TECHPRO EDUCATION");
        System.out.println("1- Uye ol");
        System.out.println("2- Giris yap");
        System.out.println("3- Cikis yap");
        System.out.println("Seciminiz: ");


    }

    public void register() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ad soyad: ");
        String name = scanner.nextLine();

        String username;
        boolean existUsername;

        do {
            System.out.println("Kullanici adi giriniz");
            username = scanner.nextLine();
            existUsername = usernameList.contains(username);
            if (existUsername) {
                System.out.println("Bu username daha once kullanilmistir. baska deneyin");
            }
        } while (existUsername);


        String email;
        boolean isValid;
        boolean existEmail;

        do {
            System.out.println("Email giriniz");
            email = scanner.nextLine().trim();
            isValid = validateEmail(email);

            existEmail = emailList.contains(email);
            if (existEmail) {
                isValid = false;
                System.out.println("Bu email daha once kullanilmistir. baska deneyin");

            }


        } while (!isValid);

        String password;
        boolean isValidPsw;
        do{
            System.out.println("Sifre giriniz");
            password = scanner.nextLine();


        }while (true); //!isValidPsw);


    }


    public static boolean validateEmail(String email) {
        boolean isValid;

        boolean space = email.contains(" ");
        boolean isContainAt = email.contains("@");

        if (space) {
            System.out.println("Bosluk iceremez");
            isValid = false;

        } else if (!isContainAt) {
            System.out.println("@ icermelidir");
            isValid = false;
        }else{
            String firstPart = email.split("@")[0];
            String secondPart = email.split("@")[1];

            boolean checkStart = firstPart.replaceAll("[a-zA-Z0-9_.-]","").length()==0;
            boolean checkEnd = secondPart.equals("gmail.com")
                             || secondPart.equals("yahoo.com")
                             || secondPart.equals("hotmail.com");

            if(!checkStart){
                System.out.println("Email kucuk harf buyuk harf rakam ve _.- disinda karakter iceremez");
            }else if(!checkEnd){
                System.out.println("Email gmail.com , yahoo.com ve hotmail.com ile bitmelidir");
            }
            isValid = checkEnd && checkStart;
        }
        return isValid;
    }

    public static boolean validatePassword(String password){
        boolean isValid;

        boolean space = password.contains(" ");
        boolean lengthGt6 = password.length()>=6;



        return space;

    }

}
