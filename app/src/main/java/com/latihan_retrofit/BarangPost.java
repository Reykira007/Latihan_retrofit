package com.latihan_retrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BarangPost {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("nama_barang")
    @Expose
    private String namaBarang;
    @SerializedName("stok")
    @Expose
    private String stok;
    @SerializedName("deskripsi")
    @Expose
    private String deskripsi;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getStok() {
        return stok;
    }

    public void setStok(String stok) {
        this.stok = stok;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
}
