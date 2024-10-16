package com.company;

public class Beyblade {
    private String beybladeci;
    private int donus_hizi;
    private int saldiri_gucu;

    public Beyblade(String beybladeci, int donus_hizi, int saldiri_hizi) {
        this.beybladeci = beybladeci;
        this.donus_hizi = donus_hizi;
        this.saldiri_gucu = saldiri_hizi;
    }

    public String getBeybladeci() {
        return beybladeci;
    }

    public void setBeybladeci(String beybladeci) {
        this.beybladeci = beybladeci;
    }

    public int getDonus_hizi() {
        return donus_hizi;
    }

    public void setDonus_hizi(int donus_hizi) {
        this.donus_hizi = donus_hizi;
    }

    public int getSaldiri_hizi() {
        return saldiri_gucu;
    }

    public void setSaldiri_hizi(int saldiri_gucu) {
        this.saldiri_gucu = saldiri_gucu;
    }
    public void saldir()
    {
        System.out.println(this.beybladeci + " "+this.saldiri_gucu+" ve" + " Dönüş hızı "+this.donus_hizi+" ile saldırılıyor");
    }

    public void kutsalCanavarOrtayaCikar()
    {
        System.out.println("Bu beyblade'in kutsal canavarı yoktur");
    }

    public void bilgileriGoster()
    {
        System.out.println("Beyblade'ci ismi : "+this.beybladeci);
        System.out.println("Saldırı gücü     : "+this.saldiri_gucu);
        System.out.println("Dönüş hızı       :"+this.donus_hizi);


    }
}
