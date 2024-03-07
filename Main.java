import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SinglyLinkedList linkedList = new SinglyLinkedList();

        while (true) {
            System.out.println("Pilihan : \n1. Tambah Buku\n2. Hapus Buku\n3. Cetak Daftar Buku\n4. Keluar");
            System.out.print("Pilih Operasi: ");
            int hasilPilihan = s.nextInt();

            System.out.println();
            if (hasilPilihan == 1) {
                System.out.print("Masukan Judul Buku : ");
                String judul = s.next();
                System.out.println();
                System.out.print("Masukan Penulis : ");
                String penulis = s.next();
                System.out.println();
                System.out.print("Masukan Tahun Terbit : ");
                int tahun = s.nextInt();
                System.out.println();
                
                System.out.println("Lokasi : \n 1. Depan\n 2. Belakang");
                System.out.print("Pilihan : ");
                int lokasi = s.nextInt();
                System.out.println();

                if (lokasi == 1) {
                    linkedList.insertAtFront(new buku(judul, penulis, tahun));
                } else if (lokasi == 2) {
                    linkedList.insertAtBack(new buku(judul, penulis, tahun));
                } else {
                    System.out.println("Inputan Tidak Valid");
                }

            } else if(hasilPilihan == 2) {
                System.out.println("Lokasi : \n 1. Depan\n 2. Belakang");
                System.out.print("Pilihan : ");
                int lokasiHapus = s.nextInt();

                if (lokasiHapus == 1) {
                    linkedList.removeFromFront();
                } else if(lokasiHapus == 2) {
                    linkedList.removeFromBack();
                } else {
                    System.out.println("Pilihan Tidak Valid");
                }

            } else if (hasilPilihan == 3) {
                System.out.println("Data Buku Yang Tersedia :");
                System.err.println();
                linkedList.print();

            } else if(hasilPilihan == 4) {

                break;
            } 
        }
    }
}