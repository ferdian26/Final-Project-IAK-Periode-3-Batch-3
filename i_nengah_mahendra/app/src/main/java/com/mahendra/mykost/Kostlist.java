package com.mahendra.mykost;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Kostlist extends AppCompatActivity {

    RecyclerView rvlistkost;
    LinearLayoutManager linear;

    List<Kost> item;
    KostAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kostlist);

        rvlistkost = (RecyclerView) findViewById(R.id.rv_list);

        linear = new LinearLayoutManager(this);
        rvlistkost.setLayoutManager(linear);

        item = new ArrayList<>();
        item.add(new Kost(R.drawable.akasia, "KOST BU IRMA", "IDR. 845.000", "Address: Jl. Tukad Balian IV, No.67 Panjer", "Deskripsi:\n" +
                "Kost Bu Irma, sebuah kost yang berlokasi di Jl. Pakisaji, Gang Cengana Sari XIV No. 1, Hayam Wuruk, Denpasar. Bangunan 2 lantai ini memiliki total 9 kamar dengan ukuran 4 x 3 meter.\n" +
                "\n" +
                "Kamar kosongan dengan kamar mandi dalam dan AC. Maksimal 2 orang perkamar. Listrik menggunakan pulsa dengan tariff Rp 2.000/kwh, sumber air PDAM dan sumur bor. Parkir cukup luas bisa untuk mobil dan motor.\n" +
                "\n" +
                "Lokasi mudah diakses dan sangat strategis, berada dilingkungan kampus seperti Warmadewa, Alfa Prima, Elizabeth International, Mahasaraswati, dll. Hanya ±15 menit ke obyek wisata Pantai Sanur, Pusat Kota Denpasar.\n" +
                " \n" +
                "\n" +
                "Fasilitas:\n" +
                " AC\n" +
                " Dapur\n" +
                " Kamar Mandi Dalam\n" +
                "\n" +
                "\n" +
                "*tidak boleh membawa binatang peliharaan\n" +
                "*harga belum termasuk listrik"));

        item.add(new Kost(R.drawable.balimedika, "Cozy House", "IDR. 900.000", "Address: Jl. Sunia Negara No. 40, Pemogan – Denpasar Selatan.", "Deskripsi:\n" +
                "Cozy House, sebuah kost yang berlokasi di Jl. Sunia Negara No. 40, Pemogan – Denpasar Selatan. Bangunan 3 lantai ini memiliki 16 kamar dengan ukuran 3 x 8 m.\n" +
                "\n" +
                "Terdapat 2 type kamar, ada kamar kosongan dan ada kamar dengan furniture (tempat tidur, nakas dan AC), masing-masing kamar dilengkapi kamar mandi dalam dengan shower, dapur dan ada teras depan yang dapat digunakan untuk bersantai. Lingkungan tenang dan nyaman. Tempat parkirnya cukup luas bisa untuk ± 16 motor dan 3-4 mobil.\n" +
                "\n" +
                "Lokasi mudah diakses dan sangat strategis. ± 15 menit ke Airport Ngurah Rai, Pantai Kuta, Legian dan Seminyak.\n" +
                "\n" +
                "*Bisa Bawa Hewan Peliharaan\n" +
                "\n" +
                "**Listrik menggunakan pulsa.\n" +
                "\n" +
                "\n" +
                "Fasilitas:\n" +
                "AC\n" +
                " Dapur\n" +
                " Kamar Mandi Dalam\n" +
                " Meja\n" +
                " Shower\n" +
                " Tempat Tidur\n" +
                " Teras Depan\n" +
                "Bulanan     : Rp 1.000.000 (kosongan), Rp 1.600.000 (dengan fasilitas)"));
        item.add(new Kost(R.drawable.kumara, "KOST ANGSOKA", "IDR. 845.000", "Address: Jl. Tukad Balian IV, No.67 Panjer", "Deskripsi:\n" +
                "Terdapat 2 type kamar, ada kamar kosongan dan ada kamar dengan furniture (tempat tidur, nakas dan AC), masing-masing kamar dilengkapi " +
                "kamar mandi dalam dengan shower, dapur dan ada teras depan yang dapat digunakan untuk bersantai. Lingkungan tenang dan nyaman. " +
                "Tempat parkirnya cukup luas bisa untuk ± 16 motor dan 3-4 mobil.\n" +
                "\n" +
                "\n" +
                "Fasilitas:\n" +
                "AC\n" +
                " Air Panas (Hot Water)\n" +
                " Balcony\n" +
                " Kamar Mandi Dalam\n" +
                " Kursi\n" +
                " KWH meter\n" +
                " Lemari\n" +
                " Lemari Es\n" +
                " Lock Hotel Key (kunci otomatis)\n" +
                " Meja\n" +
                " Shower\n" +
                " Tempat Tidur\n" +
                " Teras Belakang\n" +
                " TV LED"));
        item.add(new Kost(R.drawable.pratama, "JAYA KUSUMA", "IDR. 1200.000", "Address: Jl. Plawa No. 52, Kesiman – Denpasar Timur", "Deskripsi:\n" +
                "sebuah Apartment di pusat kota Denpasar bergaya minimalis dengan bangunan 2 lantai, yang berlokasi di Jl. Plawa No. 52, Kesiman – Denpasar Timur.\n" +
                "\n" +
                "Hanya terdiri dari 12 kamar  dengan tipe kamar yang berbeda. Mulai dari Tipe Superior, Tipe Deluxe, Tipe Super – Deluxe dan Tipe Villa. Ukuran kamarnya " +
                "dimulai dengan ukuran 3,5 m x 5 m. Fasilitas yang didapat cukup lengkap. Kamar mandi dalam menggunakan shower dan wastafel. Ada teras depan untuk " +
                "bersantai atau menerima tamu. Ada area jemur dan dapur umum. Untuk Tipe Deluxe Atas, Super – Deluxe dan Tipe Villa (Lantai 2) mendapatkan fasilitas " +
                "TV Kabel/Satelit. Untuk biaya listrik menggunakan Pulsa. Lingkungan tenang dan nyaman. Tempat parkir cukup luas. Sedangkan untuk parkir mobil di kenakan " +
                "biaya tambahan sebesar Rp 250.000/bulan.\n" +
                "\n" +
                "Lokasi mudah diakses dan sangat strategis. Dekat berbagai Universitas (Mahasaraswati, Warmadewa, Dwijendra dan Institut Seni Indonesia), hanya 5 menit " +
                "dari perkantoran dan Lapangan Renon, ±10 menit ke Shopping Mall (Matahari, Robinson dan Ramayana) dan hanya 15 menit ke Obyek wisata Pantai Sanur.\n" +
                "\n" +
                "\n" +
                "Fasilitas:\n" +
                " AC\n" +
                " Air Panas (Hot Water)\n" +
                " Kamar Mandi Dalam\n" +
                " Kursi\n" +
                " Lemari\n" +
                " Meja\n" +
                " Ruang Tamu\n" +
                " Shower\n" +
                " Tempat Tidur\n" +
                " Teras Depan\n" +
                " TV LCD\n"));
        item.add(new Kost(R.drawable.akasia, "KOST AKASIA ", "IDR. 700.000", "Address: Jl. Akasia XV, Gg.Leli No.10 Hayam Wuruk", "Deskripsi:\n" +
                "Deskripsi:\n" + "sebuah kost dengan bangunan 2 lantai yang berlokasi di Jl. Gelogor Carik I No. 3 - Denpasar. Hanya memiliki 12 kamar dengan ukuran kamar 5 x 6 meter.\n" +
                " \n" +
                "Dengan fasilitas cukup lengkap, kamar mandi dalam menggunakan shower, water heater, dan beberapa ada yang menggunakan bath tub. Tersedia dapur umum lengkap dengan peralatan memasak. Untuk listrik dikenai biaya Rp 2.000/kwh. Tempat parkirnya cukup luas bisa untuk mobil dan motor. Lingkungan tenang dan nyaman.\n" +
                " \n" +
                "Lokasi mudah diakses dan sangat strategis, hanya ± 25 menit ke Airport, dekat dengan pusat perbelanjaan Carrefour dan Mall Bali Galeria, ± 15 menit ke obyek wisata Pantai Kuta, ± 15 menit ke Pusat Kota Denpasar.\n" +
                " \n" +
                "*Tidak boleh membawa hewan peliharaan.\n" +
                "*Maksimal 2 org/kamar \n" +
                "*Harga Harian & Mingguan sudah termasuk listrik, Bulanan tidak termasuk\n" +
                " \n" +
                " \n" +
                "Fasilitas:\n" +
                "AC\n" +
                " Air Panas (Hot Water)\n" +
                " Bath Tub\n" +
                " Kamar Mandi Dalam\n" +
                " Kursi\n" +
                " Lemari\n" +
                " Lemari Es\n" +
                " Meja\n" +
                " Shower\n" +
                " Tempat Tidur\n" +
                " Teras Depan\n" +
                " TV LED\n" +
                " TV Satelit\n" +
                "\n" +
                "\n" +
                "Harga :\n" +
                "Harian   : Rp 150.000 (shower) – 200.000 (shower+bath tub, air panas, TV Cable)\n" +
                "Mingguan : Rp 900.000 (shower) – 1.200.000 (shower+bath tub, air panas, TV Cable)\n" +
                "Bulanan  : Rp 1.800.000 (shower) – 2.300.000 (shower+bath tub, air panas, TV Cable "));
        item.add(new Kost(R.drawable.pratama, "Jodha Soputan Suites", "IDR. 2500.000", "Address: Jl. Gunung Soputan I No. 86, Denpasar Barat.", "Deskripsi:\n" +
                "Jodha Soputan Suites, Sebuah kost elit yang berlokasi di Jl. Gunung Soputan I No. 86, Denpasar Barat. Bangunan 3 lantai ini memiliki 15 kamar dengan ukuran kamar 7 x 5 m.\n" +
                "\n" +
                "Fasilitas yang didapat cukup lengkap. Kamar mandi dalam menggunakan shower & bath tub, dan dilengkapi air panas / water heater. Ada dapur disetiap kamar, dan teras depan untuk bersantai. Tempat parkirnya cukup luas. Bisa untuk ±15 motor dan ± 2 mobil. Untuk biaya listrik dikenakan Rp 2.500/kwh. Lingkungan tenang dan nyaman.\n" +
                "\n" +
                "Lokasi sangat mudah diakses dan strategis. Hanya ±15 menit ke Pantai Kuta, Seminyak dan ±10 menit ke Pusat Kota.\n" +
                "\n" +
                "*Tidak boleh membawa hewan peliharaan\n" +
                "\n" +
                "*Boleh keluarga bawa anak usia diatas 5 tahun.\n" +
                "\n" +
                "\n" +
                "Fasilitas:\n" +
                " AC\n" +
                " Air Panas (Hot Water)\n" +
                " Bath Tub\n" +
                " Dapur\n" +
                " Jemuran\n" +
                " Kamar Mandi Dalam\n" +
                " Kitchen Set\n" +
                " Kursi\n" +
                " KWH meter\n" +
                " Lemari\n" +
                " Lemari Es\n" +
                " Meja\n" +
                " Ruang Jemur\n" +
                " Shower\n" +
                " Tempat Tidur\n" +
                " Teras Depan\n" +
                " TV Satelit\n" +
                "\n" +
                "\n" +
                "Harga Harian    : Rp 300.000 – Rp 400.000 (kamar dengan bath tub)\n" +
                "Harga Bulanan  : Rp 2.500.000 – Rp 3.500.000 (kamar dengan bath tub)\n"));
        item.add(new Kost(R.drawable.imaa, "Trisna Garden House", "IDR. 1700.000", "Address: JL. Waturenngong, No.346 Panjer", "Deskripsi:\n" +
                "Trisna Garden House, Sebuah homestay yang unik dan sederhana dengan suasana yang sejuk akan tanaman hijau di sekeliling halaman kamar yang berlokasi di Jl. Karang Tenget 11 AX, Tuban – Kuta Selatan.\n" +
                "\n" +
                "Homestay ini hanya terdiri dari 8 Kamar dengan ukuran kamar yang berbeda. Dengan fasilitas yang lengkap. Kamar mandi dalam menggunakan shower, ada dapur, teras depan dan taman yang hijau. Lingkungan tenang dan nyaman. Untuk tempat parkir bisa untuk mobil dan motor. Terdapat kedai di homestay yang menyediakan makanan Indo Western dengan harga yang terjangkau. \n" +
                "\n" +
                "\n" +
                "Fasilitas:\n" +
                " AC\n" +
                " Air Panas (Hot Water)\n" +
                " Dapur\n" +
                " Kamar Mandi Dalam\n" +
                " Lemari Es\n" +
                " Tempat Tidur\n" +
                " Teras Depan\n" +
                " TV LCD\n" +
                "\n" +
                "\n" +
                "*Harga Harian : Rp 180.000 - Rp 250.000 (sudah termasuk biaya listrik)\n" +
                "*Harga Mingguan : Rp 1.000.000 - Rp 1.500.000 (sudah termasuk biaya listrik)\n" +
                "*Harga Bulanan : Rp 1.700.000 - Rp 3.000.000 (sudah termasuk biaya listrik)"));

        item.add(new Kost(R.drawable.angsoka, "Kost Elite Dalung Permai", "IDR. 900.000", "Address: Jl. Perum. Dalung Permai Blok OO no. 37, Dalung", "Deskripsi:\n" +
                "Kost Elite Dalung Permai, Sebuah Kost baru yang berlokasi di Jl. Perum. Dalung Permai Blok OO no. 37, Dalung. Bangunan 2 lantai dengan ukuran kamar 3,4 x 2,6 m2.\n" +
                "\n" +
                "Hanya Terdiri dari 14 kamar. Kost kosongan dengan kamar mandi menggunakan shower, ada dapur dan teras yang dapat digunakan untuk bersantai. Untuk listrik menggunakan listrik pulsa. Lingkungan tenang dan nyaman. Tempat parkirnya cukup luas bisa untuk ±14 motor dan ±3 mobil.\n" +
                "\n" +
                "Lokasi mudah diakses dan sangat strategis, ±10 menit ke Mall/Supermarket.\n" +
                "\n" +
                "\n" +
                "Fasilitas:\n" +
                "Air Panas (tenaga surya)\n" +
                " Dapur\n" +
                " Kamar Mandi Dalam\n" +
                " Teras Depan"));
        item.add(new Kost(R.drawable.balimedika, "G7 Residence", "IDR. 2000.000", "Address: Jl. Palapa No. 8, Benoa – Kuta Selatan, Nusa Dua", "Deskripsi:\n" +
                "G7 Residence, sebuah residence yang berlokasi di Jl. Palapa No. 8, Benoa – Kuta Selatan, Nusa Dua. Bangunan 3 lantai ini memiliki  ukuran kamar 3 x 5 meter.\n" +
                "\n" +
                "Terdiri dari 74 kamar. Dengan fasilitas yang cukup lengkap. Kamar mandi dalam di lengkapi dengan shower dan hot water, Flat Screen TV dengan satellite channel, ada teras untuk bersantai dan dilengkapi dengan balkon. Ada dapur umum dilengkapi dengan kitchen set. Lingkungan tenang dan nyaman. Tempat parkirnya cukup luas. Free Wifi.\n" +
                "\n" +
                "Lokasi mudah diakses dan sangat strategis.\n" +
                "\n" +
                "\n" +
                "*tidak boleh membawa hewan peliharaan\n" +
                "\n" +
                "*harga sudah termasuk listrik\n" +
                "\n" +
                "\n" +
                "Fasilitas\n" + "AC\n" +
                " Air Panas (Hot Water)\n" +
                " Balcony\n" +
                " Jemuran\n" +
                " Kamar Mandi Dalam\n" +
                " Lemari\n" +
                " Lock Hotel Key (kunci otomatis)\n" +
                " Private Terrace\n" +
                " Shower\n" +
                " Tempat Tidur\n" +
                " TV LCD\n" +
                "\n" +
                "\n" +
                "Harga \n" +
                "Harian         : Rp   200.000 – Rp   300.000\n" +
                "Mingguan   : Rp 1.400.000 – Rp 2.100.000\n" +
                "Bulanan      : Rp Rp 2.000.000\n" +
                "\n"));
        item.add(new Kost(R.drawable.akasia, "KOST WIJAYA KUSUMA", "IDR. 840.000", "Address: Jl. Hayam Wuruk, No.278 ", "Deskripsi:\n" +
                "My Home @ Bali, sebuah Apartment yang bergaya modern dan vintage dengan bangunan 5 lantai yang berlokasi di Jl. Bhineka Jati Jaya XI/27, Kubu Anyar – Kuta.\n" +
                "\n" +
                "Terdiri dari 30 kamar dengan 3 tipe kamar yaitu Tipe Cempaka (3x4m), Tipe Sandat (4x5m) dan Tipe Jepun (5x6m). Dengan fasilitas yang lengkap, kamar mandi dalam menggunakan shower, wastafel dan air panas. Ada lift di setiap lantai, ada juga Rooftop dengan kolam renang dan mini café dengan pemandangan yang indah. Lingkungan tenang dan nyaman. Tempat parkir di basement cukup luas.\n" +
                "\n" +
                "Lokasi sangat mudah diakses dan sangat strategis. Hanya ±10 menit ke Airport Ngurah Rai, ±7 menit ke Obyek wisata Pantai Kuta, Circus Waterpark, Waterbom, Park 23, Discovery Shopping Mall dan Lippo Mall.\n" +
                "\n" +
                "\n" +
                "Fasilitas\n" +
                "AC\n" +
                " Air Panas (Hot Water)\n" +
                " Kamar Mandi Dalam\n" +
                " Kursi\n" +
                " Lemari\n" +
                " Lemari Es\n" +
                " Lock Hotel Key (kunci otomatis)\n" +
                " Meja\n" +
                " Shower\n" +
                " Telephone\n" +
                " Tempat Tidur\n" +
                " TV Satelit\n" +
                " Wastafel\n" +
                "\n" +
                "\n" +
                "*Harga sudah termasuk listrik\n" +
                "*Ganti sprei 1x/ minggu\n" +
                "*No pets\n" +
                "*Maksimal 2 org/kmr\n" +
                "*Untuk sewa harian harga tidak termasuk breakfast\n" +
                "\n" +
                "\n" +
                "Harga\t:\n" +
                "*Tipe Cempaka\n" +
                "Rp 200.000/ hari, Rp 2.500.000/bulan (low season)\n" +
                "Rp 350.000/ hari (high season)\n" +
                "\n" +
                "*Tipe Sandat\n" +
                "Rp 275.000/ hari, Rp 4.500.000/bulan (low season)\n" +
                "Rp 500.000/ hari (high season)\n" +
                "\n" +
                "*Tipe Jepun\n" +
                "Rp 350.000/ hari, Rp 5.500.000/bulan (low season)\n" +
                "Rp 600.000/ hari (high season)\n"));
        item.add(new Kost(R.drawable.pratama, "Anadianta Kost", "IDR. 1500.000", "Address: Perumahan Giri Puspa Jl. Giri Puspa Blok D8 – Nusa Dua", "Deskripsi:\n" +
                "Anadianta Kost, sebuah Rumah Kost Baru yang berlokasi di Perumahan Giri Puspa Jl. Giri Puspa Blok D8 – Nusa Dua, memiliki 2 Type Kost yaitu Type Standard & Type Suite dengan ukuran kamar 5 x 3,7 meter dan Type Villa yang berada di lantai 3.\n" +
                "\n" +
                "Rumah kost ini memiliki fasilitas cukup lengkap, kamar mandi dalam menggunakan shower dan teras depan untuk bersantai. Bagi anda yang mencari lingkungan tenang serta udara yang sejuk bisa mencoba disini. Tempat parkir cukup luas, bisa untuk ±3 mobil atau ±11 motor.  Lingkungan tenang dan nyaman.\n" +
                "\n" +
                "Lokasi mudah diakses dan sangat strategis ± 15 menit ke Airport Ngurah Rai, ± 10 menit ke Obyek Wisata Pantai Nusa Dua (Water Blow), ± 10 menit ke Supermarket Hardy’s dan ± 15 ke Kampus UNUD.\n" +
                "\n" +
                "\n" +
                "*Boleh berkeluarga membawa anak\n" +
                "*Tidak boleh membawa hewan peliharaan (binatang)\n" +
                "*Listrik menggunakan pulsa\n" +
                "\n" +
                "\n" +
                "\n" +
                "Fasilitas\n" + "AC\n" +
                " Air Panas (Hot Water)\n" +
                " Dapur\n" +
                " Kamar Mandi Dalam\n" +
                " Kamar Mandi Luar\n" +
                " Lemari\n" +
                " Meja\n" +
                " Tempat Tidur\n" +
                " Teras Depan\n" +
                " TV LCD\n" +
                "\n" +
                "\n" +
                "\n" +
                "Harga :\n" +
                "Harian   \n" +
                " - Rp 150.000 (type standar)\n" +
                " - Rp 200.000 (type suite)\n" +
                "\n" +
                "Bulanan   \n" +
                " - Rp 1.500.000 (type standar)\n" +
                " - Rp 2.000.000 (type suite)"));

        adapter = new KostAdapter(this, item);

        rvlistkost.setAdapter(adapter);

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_search, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mn_search:
                Toast.makeText(this, "Anda Mengklick Menu Search", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
