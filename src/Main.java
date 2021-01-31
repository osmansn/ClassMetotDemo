public class Main {

    public static void main(String[] args)
    {
	    Musteri musteri1= new Musteri();
	    musteri1.setMusteriAdi("Osman ŞEN");
	    musteri1.setMusteriTCNo(123456789);
	    musteri1.setMusteriMailAdres("crayzboy38@yahoo.com");
	    musteri1.setKacinciMüsteri(102);
	    Musteri musteri2= new Musteri();
	    musteri2.setMusteriAdi("Barış Znkldk");
	    musteri2.setMusteriTCNo(987654321);
	    musteri2.setMusteriMailAdres("sexi_yazilimci@gmail.com");
	    musteri2.setKacinciMüsteri(10);
        System.out.println("Müşteri Listesi");
        System.out.println("---------------");
        Musteri[] musteriList={musteri1,musteri2};

        for (Musteri musteri:musteriList)
        {
            System.out.println("Kayıtlı Müşteriler:"+musteri.getMusteriAdi()+":"+musteri.getMusteriMailAdres()+":"+musteri.getMusteriTCNo());
        }
        MusteriManager musteriManager = new MusteriManager();
        musteriManager.Ekle(musteri1);
        musteriManager.Sil(musteri2);




    }
}
