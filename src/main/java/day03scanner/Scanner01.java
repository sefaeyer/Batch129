package day03scanner;

import java.util.Scanner;

public class Scanner01 {

    //kullanıcıdan data alıp kodlarımızda kullanıcaz

    public static void main(String[] args) {

        //1.adım: Scanner  Class dan object olustur
        Scanner input = new Scanner(System.in);
        //2.adım: Kullanıcıya ne istediğinize dair mesaj veriniz
        System.out.println("lutfen yasınızı gırınız...");
        //3. adım: uygun mtodu kullanarak verdiği datayı memory ye yerleştir
        byte age = input.nextByte();
        System.out.println(age);


    }



}
