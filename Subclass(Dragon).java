package com.company;

public class Dragon  extends Beyblade{
    private String kutsalCanavar;
    private String gizliYetenek;

    public Dragon(String beybladeci, int saldiri_gucu,int donus_hizi,String kutsalCanavar,String gizliYetenek)
    {
        super(beybladeci,saldiri_gucu,donus_hizi);
        this.kutsalCanavar = kutsalCanavar;
        this.gizliYetenek = gizliYetenek;
    }

     @Override
     public void bilgileriGoster()
     {
         super.bilgileriGoster();
         System.out.println("Kutsal Canavar Adı :"+kutsalCanavar);
         System.out.println("Gizli yetenek :"+this.gizliYetenek);
     }
     @Override
     public void kutsalCanavarOrtayaCikar()
     {
         System.out.println(getBeybladeci()+" " + kutsalCanavar + "'ı ortaya çıkarıyor");
         System.out.println(getBeybladeci() + " ın saldırısı : Hayalet Kasırga ");

     }
}
