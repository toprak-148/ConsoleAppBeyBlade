package com.company;

public class Drasiel extends Beyblade{
    private String kutsalCanavar;

    public Drasiel(String beybladeci,int saldiri_gucu,int donus_hizi , String kutsalCanavar)
    {
        super(beybladeci,saldiri_gucu,donus_hizi);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal Canavar Adı :"+kutsalCanavar);
    }

    @Override
    public void kutsalCanavarOrtayaCikar()
    {
        System.out.println(getBeybladeci()+" " + kutsalCanavar + "'ı ortaya çıkarıyor");
        System.out.println(getBeybladeci() + " ın saldırısı : Kale Savunması");

    }
}
