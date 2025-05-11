/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.utsfederix;

/**
 *
 * @author Fedz
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Menu> daftarMenu = new ArrayList<>();
        daftarMenu.add(new Makanan(1, "Nasi Goreng", 15000));
        daftarMenu.add(new Makanan(2, "Kue Balok", 5000));
         daftarMenu.add(new Makanan(3, "indomie", 10000));
          daftarMenu.add(new Makanan(4, "Kentang", 15000));
           daftarMenu.add(new Makanan(5, "Ayam Bakar", 35000));
            daftarMenu.add(new Makanan(6, "Bakso", 20000));
        daftarMenu.add(new Minuman(7, "Teh Manis", 5000));
        daftarMenu.add(new Minuman(8, "Matcha Latte", 27000));
        daftarMenu.add(new Minuman(9, "Peach Tea", 21000));
        daftarMenu.add(new Minuman(10, "Lemon Tea", 20000));
        daftarMenu.add(new Minuman(11, "Air Mineral", 5000));

        System.out.print("Masukkan ID Pesanan: ");
        int id = scanner.nextInt();
        System.out.print("Masukkan No Meja: ");
        int meja = scanner.nextInt();

        Pesanan pesanan = new Pesanan(id, meja);

        while (true) {
            System.out.println("\n--- MENU ---");
            for (Menu m : daftarMenu) {
                System.out.println("[" + m.id + "] " + m.getNama() + " - Rp" + m.getHarga());
            }

            System.out.print("Pilih ID Menu: ");
            int pilih = scanner.nextInt();
            Menu menuDipilih = null;
            for (Menu m : daftarMenu) {
                if (m.id == pilih) {
                    menuDipilih = m;
                    break;
                }
            }

            if (menuDipilih == null) {
                System.out.println("Menu tidak ditemukan!");
                continue;
            }

            System.out.print("Jumlah: ");
            int jumlah = scanner.nextInt();
            pesanan.tambahItem(menuDipilih, jumlah);

            System.out.print("Tambah item lagi? (ya/tidak): ");
            if (!scanner.next().equalsIgnoreCase("ya")) break;
        }

        System.out.println("\n--- RINCIAN PESANAN ---");
        for (detail_Pesanan d : pesanan.getDetailList()) {
            System.out.println(d);
        }

        System.out.println("Total: Rp" + pesanan.hitungTotal());
        pesanan.bayar();
        System.out.println("Status: " + pesanan.getStatus());
    }
}




