import java.util.Scanner;

public class perulangan2_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double jam_kerja, gaji_harian, bonus, total_gaji, gaji_perjam, dana=0;
        int jlm_pegawai=0;
        String validasi1, validasi2;

        while (true){
            System.out.print("\nMasukkan Jam Kerja Pegawai (simbol '-' untuk berhenti) : ");
            validasi1 = input.nextLine();
            
            if (validasi1.equals("-")){
                System.out.println("Program Dihentikan");
                break;
            }
            
            jam_kerja = Double.parseDouble(validasi1);

        System.out.print("Masukkan Gaji Per-Jam : Rp ");
                validasi2 = input.nextLine();

                if (validasi2.equals("-")){
                    System.out.println("Program Dihentikan");
                    break;
                }

                gaji_perjam = Double.parseDouble(validasi2);
                
        gaji_harian = gaji_perjam*jam_kerja;
        bonus = 0;
        if(jam_kerja > 8){
            bonus = gaji_harian*0.2;
        }
        total_gaji = gaji_harian+bonus;
        dana += total_gaji;
        jlm_pegawai++;
    

        System.out.println("\nJam kerja : "+ jam_kerja +" Jam");
        System.out.println("Gaji Per-Jam : Rp "+ gaji_perjam);
        System.out.println("Gaji Harian : Rp "+ gaji_harian);
        System.out.println("Bonus : Rp "+ bonus);
        System.out.println("Total Gaji : Rp "+ total_gaji);

    }
        
        System.out.println("\nTotal Pegawai : "+jlm_pegawai);
        System.out.println("Dana Yang Diperlukan : Rp "+dana);
        input.close();
    
    }
}