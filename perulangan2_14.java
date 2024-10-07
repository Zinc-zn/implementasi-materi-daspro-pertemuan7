import java.util.Scanner;

public class perulangan2_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double jam_kerja, gaji_harian, bonus, total_gaji, dana=0;
        int jlm_pegawai=0;

        while (true){
            System.out.print("\nMasukkan Jam Kerja Pegawai (angka negatif untuk berhenti) : ");
            jam_kerja = input.nextDouble();
            
            if (jam_kerja<0){
                break;
            }
        
        System.out.print("Masukkan Gaji Harian Pegawai : Rp ");
                gaji_harian = input.nextDouble();

        bonus = 0;
        if(jam_kerja>8){
            bonus = gaji_harian*0.2;
        }
        total_gaji = gaji_harian+bonus;
        dana += total_gaji;
        jlm_pegawai++;
    

        System.out.println("\nJam kerja : "+ jam_kerja +" Jam");
        System.out.println("Gaji Harian : Rp "+ gaji_harian);
        System.out.println("Bonus : Rp "+ bonus);
        System.out.println("Total Gaji : Rp "+ total_gaji);

    }
        
        System.out.println("\nTotal Pegawai : "+jlm_pegawai);
        System.out.println("Dana Yang Diperlukan : Rp "+dana);
        input.close();
    
    }
}