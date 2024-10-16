package com.company;

public class Dranza extends Beyblade {
    private String kutsalCanavar;

    public Dranza(String beybladeci , int saldiri_gucu,int donus_hizi,String kutsalCanavar)
    {
        super(beybladeci,donus_hizi,saldiri_gucu);
        this.kutsalCanavar = kutsalCanavar;

    }

    @Override
    public void kutsalCanavarOrtayaCikar() {

        System.out.println(getBeybladeci()+" " + kutsalCanavar + "'ı ortaya çıkarıyor");
        System.out.println(getBeybladeci() + "ın saldırısı : Alev Kılıcı ");


    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal canavar adı : Kırmızı Anka Kuşu");
    }
}
