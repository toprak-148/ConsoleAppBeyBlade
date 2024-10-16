package com.company;

public class Drayga extends Beyblade {
    private String kutsalCanavar;
    public Drayga(String beybladeci, int donus_hizi, int saldiri_hizi,String kutsalCanavar) {
        super(beybladeci, donus_hizi, saldiri_hizi);
        this.kutsalCanavar = kutsalCanavar;

    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getBeybladeci()+" " + kutsalCanavar + "'ı ortaya çıkarıyor");
        System.out.println(getBeybladeci() + " ın saldırısı : Kaplan Pençesi");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal Canavar Adı :"+kutsalCanavar);
    }
}
