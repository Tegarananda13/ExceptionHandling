import java.util.Scanner;

public class faktur extends dataPembelian { // inheritance kelas data pembelian

    @Override
    public void isidata() {
        Scanner scanInt = new Scanner(System.in);
        Scanner scanStr = new Scanner(System.in);

        System.out.print("masukkan nomor faktur   : ");
        nofaktur = scanStr.nextLine();

        System.out.print("masukkan nama pelanggan : ");
        namaPelanggan = scanStr.nextLine();

        System.out.print("masukkan nomor HP       : ");
        noHP = scanStr.nextLine();

        System.out.print("masukkan nama barang    : ");
        namaBarang = scanStr.nextLine();

        System.out.println("masukkan harga barang (max sepuluh juta): ");

        try {
            hargaBarang = scanInt.nextInt();
            if (hargaBarang < 1 || hargaBarang > 10000000)
                throw new Exception();
        } 
        catch (Exception e) {
            System.out.println("Muahal Bangets");
        }

        System.out.println("masukkan jumlah beli (max 100)          : ");
        try {
            jumlahBeli = scanInt.nextInt();
            if (jumlahBeli < 1 || jumlahBeli > 100) {
                throw new Exception();
            }

        } catch (Exception e) {
            System.out.println("Secukupnya saja");
        }

        totalBayar = hargaBarang * jumlahBeli;
        try {
            if (totalBayar < 1 || totalBayar > 100000000) {
                throw new Exception();
            }

        } catch (Exception e) {
            System.out.println("Jangan bayar");
        }

        finally{
            System.out.println("Pembelian selesai \n\n\n");
        }

        scanInt.close();
        scanStr.close();
    }

    @Override
    public void cetakFaktur() {
        System.out.println("\n  *pembelian berhasil*");
        System.out.println("nomor faktur   : " + nofaktur);
        System.out.println("nama pelanggan : " + namaPelanggan);
        System.out.println("nomor HP       : " + noHP);
        System.out.println("nama barang    : " + namaBarang);
        System.out.println("harga barang   : " + hargaBarang);
        System.out.println("jumlah beli    : " + jumlahBeli);
        System.out.println("total bayar    : " + totalBayar);
    }

}
