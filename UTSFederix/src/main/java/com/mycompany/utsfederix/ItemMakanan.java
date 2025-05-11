/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.utsfederix;

/**
 *
 * @author Fedz
 */
public abstract class ItemMakanan {
    protected int id;
    protected String nama;
    protected double harga;
    protected String jenis;

    public ItemMakanan(int id, String nama, double harga, String jenis) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        this.jenis = jenis;
    }

    public abstract double hitungHarga(int jumlah);
    
    public String getNama() { return nama; }
    public double getHarga() { return harga; }
    public String getJenis() { return jenis; }
}


