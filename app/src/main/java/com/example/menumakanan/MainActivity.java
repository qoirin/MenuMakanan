package com.example.menumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.animation.LinearInterpolator;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> fotoMakanan=new ArrayList<>();
    private ArrayList<String> namaMakanan=new ArrayList<>();
    private ArrayList<String> infoMakanan=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataFromInternet();
    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(fotoMakanan, namaMakanan, infoMakanan, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getDataFromInternet(){
        namaMakanan.add("Gnocchi \n Rp. 50.000");
        fotoMakanan.add("https://www.gotravelly.com/blog/wp-content/uploads/2018/01/makanan-khas-italia-gnocchi.jpg");
        infoMakanan.add("Ini adalah salah satu makanan italia yang menjadi favorit banyak orang, Gnocchi ini merupakan jenis pangsit yang terbuat dari tepung yang dibuat dengan berbagai rasa dan juga gaya.");

        namaMakanan.add("Ravioli \n Rp. 60.000");
        fotoMakanan.add("https://www.gotravelly.com/blog/wp-content/uploads/2018/01/ravioli.jpg");
        infoMakanan.add("Ravioli awalnya merupakan makanan italia yang mulai berkembang dan terkenal pada masa romawi. Makanan ini dibuat dari bahan bayam dan juga ricotta. Menu makanan italia ini sangat cocok untuk Anda yang vegetarian dan tidak suka makan daging.");

        namaMakanan.add("Pasta Carbonara \n Rp. 40.000");
        fotoMakanan.add("https://www.gotravelly.com/blog/wp-content/uploads/2018/01/pasta-carbonara.jpeg");
        infoMakanan.add("Ciri khas dari pasta carbonara adalah krim kentalnya yang membuat rasa pasta tersebut menjadi berbeda.");

        namaMakanan.add("Pizza Margherita \n Rp. 94.500");
        fotoMakanan.add("https://www.gotravelly.com/blog/wp-content/uploads/2018/01/pizza-margherita.jpg");
        infoMakanan.add("Pizza Margherita ini merupakan makanan italia yang sederhana dan sudah mendarah daging di Italia, bahkan setiap keluarga di Italia memiliki resep pizza margheritanya sendiri dengan perpaduan saus yang dibuat dengan selera masing-masing kokinya.");

        namaMakanan.add("Cake Tiramisu \n Rp. 30.000");
        fotoMakanan.add("https://www.gotravelly.com/blog/wp-content/uploads/2018/01/tiramisu-1.jpg");
        infoMakanan.add("Tiramisu disajikan sebagai makanan yang merupakan perpaduan antara kue dan juga krim.  Biasanya rasa tiramisu merupakan perpaduan rasa dari kopi dan coklat yang dipadukan dengan krim vanilla yang lembut. Dengan rasanya yang manis dan sedikit pahit menjadikan makanan italia ini menjadi favorit");

        namaMakanan.add("Ayam Parmigiana \n Rp. 150.000");
        fotoMakanan.add("https://www.gotravelly.com/blog/wp-content/uploads/2018/01/ayam-parmigiana.jpg");
        infoMakanan.add("ayam parmigiana adalah masakan ayam yang digoreng dengan menggunakan saus, keju dan disajikan bersamaan dengan spaghetti. Saus yang digunakan pada masakan ayam parmigiana ini adalah saus yang terbuat dari tomat pilihan yang sangat lezat.");

        namaMakanan.add("Linguine Alle Vongole \n Rp. 75.000");
        fotoMakanan.add("https://www.gotravelly.com/blog/wp-content/uploads/2018/01/linguine-alle-vongole.jpg");
        infoMakanan.add("Linguine adalah sejenis pasta yang merupakan makanan italia yang juga sama terkenalnya dengan spaghetti. Vongole sendiri adalah saus yang terbuat dari campuran kerang dan bahan lainnya yang membuat rasanya menjadi sangat khas dan lezat. ");

        prosesRecyclerViewAdapter();
    }
}