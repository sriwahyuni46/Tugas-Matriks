package SriWahyuni;
// Sri Wahyuni
// 22116002

import java.util.ArrayList;
import java.util.Scanner;
public class DataMahasiswa {

    public static void main(String[] args) {

        ArrayList<String>NAMA= new ArrayList<>();
        ArrayList<String>NIM= new ArrayList<>();
        ArrayList<String>ALAMAT= new ArrayList<>();
        Scanner input= new Scanner(System.in);

        int PILIHAN;

        do {
            System.out.println(" Data Mahasiswa");
            System.out.println("=================");
            System.out.println(" 1. Masukan Data ");
            System.out.println(" 2. Tampilkan Data ");
            System.out.println(" 3. Cari Data ");
            System.out.println(" 4. Hapus Data ");
            System.out.println(" 5. Keluar");
            System.out.print(" Plih Menu :");
            PILIHAN=input.nextInt();

            if (PILIHAN==1){
                System.out.print("1. Masukan Nama:");
                String nm= input.next();
                NAMA.add(nm);

                System.out.print("2. Masukan Nim:");
                String nim= input.next();
                NIM.add(nim);

                System.out.print("3. Masukan Alamat:");
                String alt= input.next();
                ALAMAT.add(alt);
            } else if (PILIHAN==2) {
                System.out.println(" Data Mahasiswa");
                System.out.println("=================");

                for (int i = 0; i < NAMA.size(); i++) {
                    System.out.println(i+1+"."+ NAMA.get(i));
                }

            } else if (PILIHAN==3) {
                System.out.print(" Masukan data uang akan di cari:");
                int dapat=input.nextInt();
                if(dapat==1){

                    System.out.println("1. Nama"+NAMA.get(0));
                    System.out.println("2. Nim"+NIM.get(0));
                    System.out.println("3. Alamat"+ALAMAT.get(0));
                }
                if(dapat==2){

                    System.out.println("1. Nama"+NAMA.get(1));
                    System.out.println("2. Nim"+NIM.get(1));
                    System.out.println("3. Alamat"+ALAMAT.get(1));
                }
            } else if (PILIHAN==4) {


                for (int i = 0; i < NAMA.size(); i++) {
                    System.out.println(i+1+"."+ NAMA.get(i));
                }
                System.out.println(" MASUKAN NAMA YANG INGIN DI HAPUS:");
                String nm= input.next();
                NAMA.remove(nm);

            } else if (PILIHAN==5) {
                System.out.println(" selesai");

            }
        }while (PILIHAN != 5);
    }

}
