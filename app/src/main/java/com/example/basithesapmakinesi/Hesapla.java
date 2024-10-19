package com.example.basithesapmakinesi;

public class Hesapla {
    private int gelenSayi1,gelenSayi2;
//num lk kapalı halde alt+0 basarsak constructor oluşturabiliriz.
    public Hesapla(int gelenSayi1, int gelenSayi2) {
        this.gelenSayi1 = gelenSayi1;
        this.gelenSayi2 = gelenSayi2;
    }
    public int toplam(){
        return gelenSayi1+gelenSayi2;
    }
    public int fark(){
        return gelenSayi1-gelenSayi2;
    }
    public int bolum(){
        return gelenSayi1/gelenSayi2;
    }
    public int carpim(){
        return gelenSayi1*gelenSayi2;
    }


}
