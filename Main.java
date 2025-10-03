public class Main {
    public static void main(String[] args) {
        
        // Sekarang kita bisa menggunakan nama kelas 'Utility' secara langsung
        Utility.tampilkanPesan("Halo, ini program utama!"); 
        
        // Contoh tanpa import (menggunakan FQN - Fully Qualified Name):
        java.util.Date tanggal = new java.util.Date();
        System.out.println("Tanggal Hari Ini (dengan FQN): " + tanggal);
    }
}