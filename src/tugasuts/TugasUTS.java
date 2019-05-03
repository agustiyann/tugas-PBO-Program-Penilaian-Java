package tugasuts;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class TugasUTS {

    public static void main(String[] args) {
        // write your code here
        BufferedReader InputData = new BufferedReader(new InputStreamReader(System.in));

        String nama = "";
        String nim = "";
        String kelas = "";
        String nilaiTugas1 = null;
        String nilaiTugas2 = null;
        String nilaiTugas3 = null;
        String nilaiUTS = null;
        String nilaiUAS = null;

        System.out.println("---------------------------------------");
        System.out.println("   PROGRAM PENILAIAN MATA KULIAH PBO   ");
        System.out.println("---------------------------------------");

        // INPUT NAMA
        System.out.print("Masukkan Nama Anda : ");
        try {
            nama = InputData.readLine ();
        }
        catch (IOException e) {
            System.out.println("Error");
        }

        // INPUT NIM
        System.out.print("Masukkan NIM : ");
        try {
            nim = InputData.readLine();
        }
        catch (IOException e) {
            System.out.println("Error");
        }

        // INPUT KELAS
        System.out.print("Masukkan Kelas : ");
        try {
            kelas = InputData.readLine();
        }
        catch (IOException e) {
            System.out.println("Error");
        }

        System.out.println("----------------------");
        System.out.println("   INPUT NILAI ANDA   ");
        System.out.println("----------------------");

        // -- INPUT NILAI TUGAS --

        // nilai tugas 1
        System.out.print("Nilai Tugas 1 : ");
        try {
            nilaiTugas1 = InputData.readLine();
        }
        catch (IOException e) {
            System.out.println("Error");
        }
        int nTugas1 = Integer.valueOf(nilaiTugas1).intValue();

        // nilai tugas 2
        System.out.print("Nilai Tugas 2 : ");
        try {
            nilaiTugas2 = InputData.readLine();
        }
        catch (IOException e) {
            System.out.println("Error");
        }
        int nTugas2 = Integer.valueOf(nilaiTugas2).intValue();

        // nilai tugas 3
        System.out.print("Nilai Tugas 3 : ");
        try {
            nilaiTugas3 = InputData.readLine();
        }
        catch (IOException e) {
            System.out.println("Error");
        }
        int nTugas3 = Integer.valueOf(nilaiTugas3).intValue();

        // INPUT NILAI UTS
        System.out.print("Nilai UTS : ");
        try {
            nilaiUTS = InputData.readLine();
        }
        catch (IOException e) {
            System.out.println("Error");
        }
        int nUTS = Integer.valueOf(nilaiUTS).intValue();

        // INPUT NILAI UAS
        System.out.print("Nilai UAS : ");
        try {
            nilaiUAS = InputData.readLine();
        }
        catch (IOException e) {
            System.out.println("Error");
        }
        int nUAS = Integer.valueOf(nilaiUAS).intValue();

        // PERSENTASE NILAI
        double persentaseNilaiTugas = (( nTugas1 + nTugas2+ nTugas3 ) / 3) * 0.2;
        double persentaseNilaiUTS   = nUTS * 0.3;
        double persentaseNilaiUAS   = nUAS * 0.5;

        double nilaiAkhir = (persentaseNilaiTugas + persentaseNilaiUTS + persentaseNilaiUAS);

        System.out.println("-----------------------");
        System.out.println("      HASIL AKHIR      ");
        System.out.println("-----------------------");

        // -- OUTPUT --
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Kelas   : " + kelas);

        System.out.println("Nilai Akhir Mata Kuliah PBO : " + nilaiAkhir);

        if (nilaiAkhir >= 85 && nilaiAkhir <= 100) {
            System.out.println("Grade Mata Kuliah A");
        } else if (nilaiAkhir >= 70 && nilaiAkhir < 85) {
            System.out.println("Grade Mata Kuliah B");
        } else if (nilaiAkhir >= 55 && nilaiAkhir < 70) {
            System.out.println("Grade Mata Kuliah C");
        } else if (nilaiAkhir == 50 && nilaiAkhir < 55) {
            System.out.println("Grade Mata Kuliah D");
        } else {
            System.out.println("Grade Mata Kuliah E");
        }

        if (nilaiAkhir >= 75) {
            System.out.println("Anda LULUS Mata Kuliah PBO");
        } else {
            System.out.println("Anda TIDAK LULUS Mata Kuliah PBO");
        }

        // ** This code built by AGUS TIYANSYAH SYAM || 17180117

    }
    
}
