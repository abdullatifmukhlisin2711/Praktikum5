import java.util.Scanner;
public class PemilihanPercobaan201 {

    public static void main(String[] args) {
        Scanner input01 = new Scanner(System.in);
        System.out.print("Nilai uas  : ");
        float uas = input01.nextFloat();
        System.out.print("Nilai uts  : ");
        float uts = input01.nextFloat();
        System.out.print("Nilai kuis  : ");
        float kuis = input01.nextFloat();
        System.out.print("Nilai tugas  : ");
        float tugas = input01.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        //String message = total <65 ? "Remidi" : "Tidak remidi";
       // System.out.println("Nilai akhir = " + total + " sehingga " + message);
       
       if (80 < total & total <= 100){
           System.out.println("Nilai A (Sangat Baik)");
       }
        else if (73 < total & total  <= 80){
            System.out.println("Nilai B+ (Lebih dari Baik)");
        }
        else if (65 < total & total <= 73){
            System.out.println("Nilai B (Baik)");
        }
        else if (60 < total & total <= 65){
            System.out.println("Nilai C+ (Lebih dari Cukup)");
        }
        else if (50 < total & total <= 60){
            System.out.println("Nilai C (Cukup)");
        }
        else if (34 < total & total <= 50){
            System.out.println("Nilai D (Kurang)");
        }
        else {
            System.out.println("Nilai E (gagal)");
        }
    }

}
