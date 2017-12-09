package com.example.user.nusantara;

import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView txt_title,txt_subtitle,txt_detail;
    ImageView gbr_detail;

    private String title,id,desc,subtitle;
    private int id_gbr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        setupElement();

        id = getIntent().getStringExtra("id");
        title = getIntent().getStringExtra("title");
        subtitle = getIntent().getStringExtra("subtitle");

        setData(id,title,subtitle);
    }


    private void setupElement(){
        txt_title = (TextView) findViewById(R.id.title_detail);
        txt_subtitle = (TextView) findViewById(R.id.subtitle);
        txt_detail = (TextView) findViewById(R.id.txt_content_detail);
        gbr_detail = (ImageView) findViewById(R.id.gbr_detail);
    }

    public void setData(String id,String title,String subtitle){
        txt_title.setText(title);
        txt_subtitle.setText(subtitle);

        getDetail(id);

        txt_detail.setText(desc);
        gbr_detail.setImageResource(id_gbr);
    }



    public String getDetail(String id){
        desc = "";

        switch (id){
            /*.. Desc Culture ..*/
            case "c1" :
                desc ="Perang pandan adalah salah satu tradisi yang ada di Desa Tenganan, Kecamatan Karangasem, Bali. Perang pandan juga disebut dengan istilah makere-kere. Upacara perang pandan menjadi daya tarik bagi wisatawan, baik wisatawan dalam negeri maupun wisatawan asing. Peran pandan merupakan salah satu tradisi yang dilakukan untuk menghormati dewa Indra atau Dewa perang.Perang pandan merupakan bagian dari ritual Sasihh Sembah. Sasih sembah ialah ritual terbesar yang ada di Desa Tenganan.";
                id_gbr = getResources().getIdentifier("com.example.user.nusantara:drawable/"+id,null,null);
                break;

            case "c2" :
                desc = "Dalam upacara tradisional Indonesia ini, akan ada dua kelompok yang melakukan “perang-perangan”. Setiap kelompok yang terdiri atas lebih dari 100 pemuda itu “berperang” dengan bersenjatakan tombak dari kayu yang ujungnya tumpul, dan juga mengenakan baju perang dalam adat mereka. Pada bulan Februari atau Maret setiap tahunnya, upacara ini akan digelar untuk menyampaikan doa kepada Tuhan, agar panen mereka pada tahun itu bisa berhasil.";
                id_gbr = getResources().getIdentifier("com.example.user.nusantara:drawable/"+id,null,null);
                break;

            case "c3" :
                desc = "Upacara yang satu ini sebenarnya lebih berkaitan dengan religi, berdasarkan kepercayaan umat Islam Tapi hanya ditemukan di Kabupaten Padang Pariaman, Sumatera Barat. Sehingga, menjadi sebuah tradisi yang khas dari daerah tersebut. Upacara Tabuik ini digelar sebagai bentuk peringatan atas kematian anak Nabi Muhammad SAW dalam sebuah perang di zaman Rasulullah dulu. Dilakukan pada Hari Asura setiap tanggal 10 Muharram tahun Hijriah. Beberapa hari sebelum datangnya waktu penyelenggaraan upacara ini, masyarakat akan bergotong royong untuk membuat dua tabuik. Kemudian, pada hari H, kedua tabuik itu di arak menuju laut di Pantai Gondoriah. Satu tabuik diangkat oleh sekitar 40 orang. Di belakangnya, rombongan masyarakat dengan baju tradisional mengiringi, bersamaan dengan para pemain musik tradisional. Lalu, kedua tabuik itupun dilarung ke laut.";
                id_gbr = getResources().getIdentifier("com.example.user.nusantara:drawable/"+id,null,null);
                break;

            case "c4" :
                desc = "Dulu, saat desa-desa di Nias dipimpin oleh bangsawan - bangsawan dari strata balugu, mereka menentukan pantas atau tidaknya pemuda Nias menjadi prajurit perang. Selain wajib menguasai ilmu bela diri, fisik yang kuat, dan ilmu hitam, calon prajurit tersebut juga harus mampu melompati batu bersusun yang tingginya 2 meter dan tidak boleh menyentuh permukaan batu sedikitpun. Saat ini, tradisi lompat batu sudag tidak lagi digunakan sebagai persiapan untuk perang antar desa maupun antar suku, tetapi lebih fokus sebagai ritual khas masyarakat Nias. Pemuda yang dapat melakukan tradisi lompat batu ini akan dianggap sudah matang dan dewasa secara fisik sehingga ia pun boleh menikah. Selain itu, orang yang dapat melakukan tradisi lompat batu ini juga dianggap akan menjadi pembela desa jika terjadi konflik di desanya.";
                id_gbr = getResources().getIdentifier("com.example.user.nusantara:drawable/"+id,null,null);
                break;


            /*.. Desc Hand Craft ..*/
            case "cr1" :
                desc = "Kerajinan ukir - ukiran dari kayu kecuali furnitur.\n" + "\nAlamat : Ds. Peringsada, Gianyar, Bali, Indonesia \n"
                + "Telepon : (0361) 950539";
                id_gbr = getResources().getIdentifier("com.example.user.nusantara:drawable/"+id,null,null);
                break;
            case "cr2" :
                desc = "Imogiri merupakan sentra kerajinan batik tulis tertua di Bantul. Sentra ini sudah ada sejak jaman pemerintahan Sultan Agung memerintah kerajaan Mataram. Mayoritas perempuan di daerah ini pembatik dari generasi ke generasi. Saat ini jumlah perempuan yang jadi pembatik di bantul sekitar 1.200 orang\n"
                + "\nAlamat : Dsn. Giriloyo - Ds. Wukirsari 02/20 -Kec. Imogiri - Kab. Bantul Yogyakarta\n"
                + "Telepon : 085-729-269-403, 085-215-997-478";
                id_gbr = getResources().getIdentifier("com.example.user.nusantara:drawable/"+id,null,null);
                break;
            case "cr3":
                desc = "Tenun ikat Desa Fafinesu adalah gambaran keutuhan tradisi dan budaya lokal yang menghidupkan religiositas dan harmoni hidup bersama. Tenun ikat adalah warisan tradisi yang harus dijaga kelestariannya.\n"
                        +"\nAlamat : desa Fafinesu A, RT 7, RW 2 , kecamatan Insana Fafinesu";
                id_gbr = getResources().getIdentifier("com.example.user.nusantara:drawable/"+id,null,null);
                break;
            case "cr4" :
                desc = "Kota Palangkaraya, ibu kota Provinsi Kalimantan Tengah, memiliki kerajinan khas anyaman rotan. Beberapa bentuk kerajinan antara lain tas, tikar, topi, kotak tisu, dan sandal.\n"
                + "\nAlamat : jl. Manunggal 2 no 28 Palangkaraya - Kalimantan Tengah"
                + "\nTelepon : 082157774498"
                + "\nE-mail : rotanmulyono@yahoo.co.id";
                id_gbr = getResources().getIdentifier("com.example.user.nusantara:drawable/"+id,null,null);
                break;


             /*.. Brand Local ..*/
            case "lb1":
                desc = "Unik adalah kualitas yang banyak rindu untuk mencapainya. Namun terkadang orang takut melangkah keluar dari barisan keanggunan yang sangat disukai.\n" +
                        "Kami berada di Manikan siap memenuhi keinginan Anda dengan menambahkan Endek, keindahan tradisional Bali yang memikat, sesuai dengan struktur kehidupan Anda.\n"
                + "\nE-mail : ask@manikan.co";
                id_gbr = getResources().getIdentifier("com.example.user.nusantara:drawable/"+id+"_d",null,null);
                break;

            case "lb2":
                desc = "Sejauh Mata Memandang terinspirasi oleh hal-hal kecil yang membuat kita mencintai indonesia. Kami bekerja dengan teman pengrajin master kami di Sumba, Bali dan Jawa dimana tekstil kami dibuat dengan teknik usia tua satu per satu dan setiap pola memiliki cerita yang dibuat oleh manusia unik dengan cinta untuk Anda pakai dan bagikan. Setiap potongan kain bisa dimainkan dengan hati-hati menjadi syal dan sebaliknya. Kain ujung yang ringan, hangat, abadi, dan dpt dipakai."
                + "\n" + "\nE-mail :  pesan@sejah.com | store@sejauh.com";
                id_gbr = getResources().getIdentifier("com.example.user.nusantara:drawable/"+id+"_d",null,null);
                break;

            case "lb3":
                desc = "Kumpulan LEKAT, menceritakan keasyikan para penenun tradisional Baduy untuk berbagi keindahan budaya Indonesia yang dimanifestasikan dalam setiap motif kain unik - yang tidak pernah gagal menceritakan kisah mimpi, tekad dan kemenangan."
                        + " Merayakan kelas dengan keunggulan, setiap koleksi LEKAT untuk setiap musim adalah bakat lain untuk presentasi mode yang memadukan tekstil tradisional ke dalam desain modern yang memungkinkan pria dan wanita merasa nyaman saat membuat pernyataan elegan."
                        + "\n" + "\nE-mail :  info@lekatdihati.com";
                id_gbr = getResources().getIdentifier("com.example.user.nusantara:drawable/"+id+"_d",null,null);
                break;

            case "lb4":
                desc = "Ageman adalah merek lokal Indonesia yang suka menciptakan perpaduan yang hebat antara tampilan fashion tradisional dan modern sehingga bisa dipakai di semua acara - formal dan informal. Meski kata 'ageman' berarti pakaian dalam bahasa Jawa, sebenarnya Ageman menganut hampir semua kain tradisional di Indonesia. Ageman menghargai proses pembuatan bahan tradisional. Alih-alih menggunakan yang dicetak untuk mendapatkan kain bermotif tradisional, Ageman memilih untuk bekerja sama dengan pengrajin lokal dengan menggunakan cara tradisional untuk membuat kain yang indah."
                        ;
                id_gbr = getResources().getIdentifier("com.example.user.nusantara:drawable/"+id+"_d",null,null);
                break;
        }

        return desc;
    }
}
