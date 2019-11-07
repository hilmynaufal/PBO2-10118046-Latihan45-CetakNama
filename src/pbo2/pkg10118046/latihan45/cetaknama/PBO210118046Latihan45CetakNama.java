/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118046.latihan45.cetaknama;

import java.util.Scanner;

/**
 *
 * @author
 *  Nama              : M. Hilmy Naufal
 *  Kelas             : IF2
 *  NIM               : 10118046
 *  Deskripsi Program : mencetak nama beberapa kali
 */
public class PBO210118046Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Printer printer = new Printer();
        System.out.println("======Aplikasi Pencetak Nama======");
        System.out.print("Masukkan nama anda: "); printer.setNama(scanner.nextLine());
        System.out.print("Mau cetak nama berapa kali? "); printer.setJmlCetak(scanner.nextInt());
        printer.cetak(printer.getNama());
        printer.cetak(printer.getJmlCetak(), printer.getNama());
        
    }

}
