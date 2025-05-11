/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.utsfederix;

/**
 *
 * @author Fedz
 */
import java.util.ArrayList;

public class Pesanan {
    private int id;
    private int meja;
    private String status;
    private ArrayList<detail_Pesanan> detailList;

    public Pesanan(int id, int meja) {
        this.id = id;
        this.meja = meja;
        this.status = "belum dibayar";
        this.detailList = new ArrayList<>();
    }

    public void tambahItem(Menu menu, int jumlah) {
        detailList.add(new detail_Pesanan(id, menu, jumlah));
    }

    public double hitungTotal() {
        double total = 0;
        for (detail_Pesanan d : detailList) {
            total += d.getTotalHarga();
        }
        return total;
    }

    public void bayar() {
        status = "dibayar";
    }

    public String getStatus() {
        return status;
    }

    public ArrayList<detail_Pesanan> getDetailList() {
        return detailList;
    }
}

