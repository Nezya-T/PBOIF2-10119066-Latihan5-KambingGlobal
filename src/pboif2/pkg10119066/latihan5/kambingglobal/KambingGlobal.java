/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119066.latihan5.kambingglobal;

/**
 *
 * @author Neyza-T
 * Nama : Nezya Tariska
 * Nim : 10119066
 * Kelas PBO/IF2
 */
public class KambingGlobal {
    int jumlahKambing = 88;

    /**
     * @param args the command line arguments
     */
    public void getJumlahKambing() {
    System.out.println("Jumlah Kambing: " + jumlahKambing);
}
    public void tambahKambing() {
    jumlahKambing = jumlahKambing + 5;
    System.out.println("Jumlah kambing setelah ditambah: " + jumlahKambing);
}
    public static void main(String[] args) {
        KambingGlobal kambingSusu = new KambingGlobal();
        
        //menampilkan jumlah kambing yang ada saat program pertama x berjalan
        kambingSusu.getJumlahKambing();
        
        //menambah satu kambing
        kambingSusu.tambahKambing();
        
        //menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
    }
    
}
