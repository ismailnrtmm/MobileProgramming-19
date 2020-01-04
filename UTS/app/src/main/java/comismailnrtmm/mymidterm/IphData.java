package comismailnrtmm.mymidterm;

import java.util.ArrayList;

public class IphData {

    public static String[][] data = new String[][]{
            {"0", "iPhone 6s","Okeh ini adalah iphone 6s yang rilis pada tanggal 25 september 2015, which is udah lama banget dong yah but hp ini masih bisa diapgred sampe ios ke 13!! woaw sekali bukan? harga hp nya sekarang sih sekitar 3jutaan kali ya?", "https://i.postimg.cc/d3ZBrLFM/ip6s.jpg","iPhone 6s"},
            {"1", "iPhone 6s+", "Kalo yang ini sama aja cui kaya iphone 6s bedanya ya ini ada plus nya, rilis nya juga bareng kok sama iphone 6s yang beda ya fiturnya lebih ekstra aja, harga sekarang sekitar 4jt kali ya? ", "https://i.postimg.cc/Qx1LrMTn/ip6s.jpg","iPhone 6s"},
            {"2", "iPhone SE", "Kalo yang ini SE, which means Special Edition dari rilisnya aja udah beda dia bulan maret sendiri tanggal 21 Maret 2016 hp nya imut kecil kaya ip5s tapi mesin kaya ip6s, harga? 3jtan kali ya ", "https://i.postimg.cc/HxVKvWmz/ipse.png","iPhone 6s"},
            {"3", "iPhone 7", "sekarang masuk ke seven, iphone 7 ini udah mulai banyak yang berubah dan lebih besar rilis tanggal 16 September 2016, dipake sekarang? masih oke ko, harganya juga 4 jutaan aja ko ", "https://i.postimg.cc/ZY1kgNCd/ip7.jpg ","iPhone 6s"},
            {"4", "iPhone 7+", "mirip yang tadi ini bedanya udah mulai dual camera, nah ip7 ini iphone pertama yang bisa dual camera! mantap, kalo skrg si udah ga jaman ya 2 camera doang, rilis sama aja kaya ip7, harga? 5jtan gais", "https://i.postimg.cc/52Vh9M59/ip7.jpg","iPhone 6s"},
            {"5", "iPhone 8", "tadi 7 sekarang 8! tanggal rilis 22 september 2017, iphone 8 udah mulai gede nih bentuknya, chipset pun makin bagus banget, apalg kameranya wadidaw gais, cuma ini 1 kamera aja ya, dipake taun ini masi oke banget, harga 6jtan ya", "https://i.postimg.cc/W4d3y4yZ/ip8.jpg","iPhone 6s"},
            {"6", "iPhone 8+", "ini ip8 seri plus plus nya woah pokoknya bagus! kamera dobel batre lebih besar, ukuran layar juga, pokoknya canggih banget dah ini masih bagus kalo dipake taun ini harga sekitar 7jt ya gais ", "https://i.postimg.cc/x83TmNXw/ip8.jpg","iPhone 6s"},
            {"7", "iPhone X", "Kemana 9 ya? Holla ini ip x which is ip x ini mantep pisan layar udh full display hp iphone pertama yang pake poni gais, oiya tanggal rilis 3 November 2017 ya, kamera nya petcah abis sih pokonya mantup, harga masih mahal gais sekitar 8jt an ", "https://i.postimg.cc/0yQ26QP4/ipx.jpg","iPhone 6s"},
            {"8", "iPhone XR", "wadaw ini hp inceran gua dulu :( bagus euy warna nya banyak pilihan mana bisa dual sim! tapi kamera cuman 1 eits hasil masih lebih bagus dari ipx loh, rilis 26 Oktober 2018, harga masih mehong euy 9 10jt an huhu, ooiya batrenya awet gila gais", "https://i.postimg.cc/nhvTDH2v/ipxr.png","iPhone 6s"},
            {"9", "iPhone XS","tadi Xr sekarang XS! jujur xs bentuk ga terlalu beda sama x, hanya saja kamera dan chipsetnya yang semakin wouw banget gais, tanggal rilis 21 September 2018, harga 10 11jt an ya gengs", "https://i.postimg.cc/vZR3T1rY/ipxs.png","iPhone 6s"},
            {"10", "iPhone XS Max","Nah ini XS Max, bedanya apa? mirip kaya seri yang plus xs max ini adalah xs versi jumbo, dari mulai bentuk sampe batrenya yang awet parah! tanggal rilis nya pun sama ko, harga masih 12jtan gengs","https://i.postimg.cc/Y91pcLzv/ipxsmax.jpg","iPhone 6s"},
            {"11", "iPhone 11","11! kaget ga udah 11 aja? gila sih baru banget keluar nih tepat tanggal 20 September 2019 ip11 ini rilis dengan kamera boba nya yang sedikit aneh tapi menjadi pusat perhatian, btw kamera ada 2 ya bukan 3 harga hp ini sekitar 12jt saja gais ", "https://i.postimg.cc/tCnB9dVv/ip11.png","iPhone 6s"},
            {"12", "iPhone 11 Pro","versi lebih mantep dari yang tadi, ini bener bener kamera boba karena kameranya ada 3 gais! hp iphone pertama dengan 3 kamera yang wadidaw!! rilisnya sama kok kaya 11 harga sekitar 14an ya gais", "https://i.postimg.cc/9fCbPvgs/ip11pro.png","iPhone 6s"},
            {"13", "iPhone 11 Pro Max","dan ini versi yang paling jumbo dari semua iphone saat ini! dari chipset sampai kamera!! pokoknya kalo lo sultan udah beli aja ini langsung tanpa pikir panjang intinya mah ini paling terbaik deh!", "https://i.postimg.cc/RF0TywBR/ip11promax.png","iPhone 11 Pro Max"},
    };

    public static ArrayList<iph> getListData() {
        ArrayList<iph> list = new ArrayList<>();
        for (String[] IphData : data) {
            iph iph = new iph();
            iph.setId(Integer.parseInt(IphData[0]));
            iph.setName(IphData[1]);
            iph.setDescription(IphData[2]);
            iph.setPhoto(IphData[3]);
            iph.setTitle (IphData[4]);

            list.add(iph);
        }
        return list;
    }
}