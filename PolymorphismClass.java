package com.company;

public class BeybladeFabrikasi {
    public Beyblade beybladeUret( String byblade_turu)
    {
        if(byblade_turu.equals("Dragon"))
        {
           return new  Dragon("Takao",300,800,"Mavi Ejderha","Kutsal Canavarla Konuşma");

        }
        else if(byblade_turu.equals("Dranza"))
        {
            return new Dranza("Kai",400,600,"Kırmızı Anka Kuşu");
        }
        else if(byblade_turu.equals("Drayga"))
        {
            return new Drayga("Rei",250,800,"Beyaz Kaplan");
        }
        else if(byblade_turu.equals("Drasiel"))
        {
            return  new Drasiel("Max",400,1000,"Kara Kaplumbağa");
        }
        else{
            return null;
        }
    }

}
