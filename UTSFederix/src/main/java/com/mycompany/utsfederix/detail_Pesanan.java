/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.utsfederix;

/**
 *
 * @author Fedz
 */
public class detail_Pesanan {
    private int pesananId;
    private Menu menu;
    private int jumlah;

    public detail_Pesanan(int pesananId, Menu menu, int jumlah) {
        this.pesananId = pesananId;
        this.menu = menu;
        this.jumlah = jumlah;
    }

    public double getTotalHarga() {
        return menu.hitungHarga(jumlah);
    }

    public String toString() {
        return menu.getNama() + " x" + jumlah + " = Rp" + getTotalHarga();
    }

    public Menu getMenu() { return menu; }
    public int getJumlah() { return jumlah; }
}


