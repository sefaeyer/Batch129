package mini_projects.AppointmentApp;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//3-randevu islemleri
public class AppointmentService {
    Scanner inp=new Scanner(System.in);
    //4-randevu listesi
    List<Appointment> appointments=new ArrayList<>();
    //5-tarih listesi(bir gun sonradan baslicak)
    List<LocalDate> dates=new ArrayList<>();

    //6-uygulama basladiginda ertesi gunden itibaren 7 gunluk bir takvim sunulacak
    public AppointmentService(){
        LocalDate day=LocalDate.now();
        for(int i=0; i<3;i++){
            day=day.plusDays(1);//ertesi gun
            dates.add(day);
        }
    }

    //7-randevu olusturma
    public void getAppointment(){
        //8-randevu takvimi dolumu
        if(this.dates.isEmpty()){
            System.out.println("Bu hafta tum randevular dolmustur, daha sonra tekrar deneyiniz.");
        }else{
            System.out.println("Lutfen isminizi giriniz");
            String name=inp.nextLine();
            System.out.println("Sayin "+name+", randevu alabilecginiz tarihler: ");
            for(int i=0;i<this.dates.size();i++){
                System.out.println((i+1)+" - "+this.dates.get(i));
            }
            System.out.println("Randevu almak istediginiz tarihin numarasini giriniz: ");
            int numberOfDate=inp.nextInt();
            inp.nextLine();
            //9-secilen tarih no gecerli mi
            if(numberOfDate>0 && numberOfDate<=this.dates.size()){
                Appointment appointment=new Appointment(name,this.dates.get(numberOfDate-1));
                this.appointments.add(appointment);
                System.out.println("------------------------------------------------------------------------");
                System.out.println("Sayin "+name+", Randevu tarihiniz: "+appointment.getDate());
                System.out.println("Randevo no: "+appointment.getId()+" ile randevunuzu goruntuleyebilirsiniz.");
                System.out.println("------------------------------------------------------------------------");
                this.dates.remove(numberOfDate-1);
            }else{
                System.out.println("Hatali giris!");
            }


        }


    }
//10-randevu goruntuleme
    public void printAppointment(){
        System.out.println("Randevu No giriniz");
        boolean isExists=true;
        int appNo=inp.nextInt();
        inp.nextLine();
        for(Appointment app:this.appointments){
            if(app.getId()==appNo){
                System.out.println("------------------------------------");
                System.out.println(appNo+" nolu Randevu Bilgileri:");
                System.out.println("Isim           : "+app.getName());
                System.out.println("Randevu tarihi : "+app.getDate());
                System.out.println("------------------------------------");
                isExists=true;
                break;
            }else{
                isExists=false;
            }
        }
        if(!isExists){
            System.out.println("Randevu bulunamadi.");
        }


    }
//11-randevu iptal
    public void cancelAppointment(){
        boolean isExists=true;
        System.out.println("Randevu No giriniz:");
        int appNo=inp.nextInt();
        inp.nextLine();
        for(Appointment app:this.appointments){
            if(app.getId()==appNo){
                isExists=true;
                this.appointments.remove(app);
                this.dates.add(app.getDate());
                System.out.println(app.getDate()+" tarihli randevunuz iptal edildi.");

                break;
            }else{
                isExists=false;
            }
        }
        if(!isExists){
            System.out.println("Randevu bulunamadi.");
        }


    }


}
