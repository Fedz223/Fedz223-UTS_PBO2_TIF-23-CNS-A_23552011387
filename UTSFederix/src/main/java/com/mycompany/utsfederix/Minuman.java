/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.utsfederix;

/**
 *
 * @author Fedz
 */
public class Minuman extends Menu {
    public Minuman(int id, String nama, double harga) {
        super(id, nama, harga, "Minuman");
    }

    @Override
    public double hitungHarga(int jumlah) {
        return harga * jumlah;
    }
}


