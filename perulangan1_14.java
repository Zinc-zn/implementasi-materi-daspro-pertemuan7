import java.util.Scanner;

public class perulangan1_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double jam_belajar, total_belajar=0;
        int hari;
        String nama_hari;

        for (hari = 1; hari<=7; hari++){
            switch (hari) {
                case 1:
                    nama_hari = "Senin";
                    break;
                case 2:
                    nama_hari = "Selasa";
                    break;
                case 3:
                    nama_hari = "Rabu";
                    break;
                case 4:
                    nama_hari = "Kamis";
                    break;
                case 5:
                    nama_hari = "Jumat";
                    break;
                case 6:
                    nama_hari = "Sabtu";
                    break;
            
                default:
                    nama_hari = "Minggu";
            }
                boolean inputValid = false;
                do {
                    System.out.print("\nMasukkan Jam Belajar Hari "+nama_hari+" : ");
                    jam_belajar=input.nextDouble();
                    if (jam_belajar > 10){
                        System.out.println("Jam Belajar Tidak Boleh Melebihi 10 Jam! ");
                    }else{
                        inputValid = true;
                        total_belajar += jam_belajar;
                        System.out.println("Jam Belajar Hari "+nama_hari+" : "+jam_belajar);
                    }
            }while (!inputValid);
        }
        System.out.println("\nTotal Jam Belajar :" +total_belajar);
        input.close();
    }
}