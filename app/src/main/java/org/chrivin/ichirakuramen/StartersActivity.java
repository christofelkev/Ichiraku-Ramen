package org.chrivin.ichirakuramen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StartersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starters);

        ListView startersList = findViewById(R.id.list_view_starters);



        Dish[] dishes = {
                new Dish("Tonkotsu Ramen","Japanese noodle soup made with a pork bone broth—ton means pork and kotsu means bone.",45000),
                new Dish("Miso Ramen","broth is made from miso along with chicken stock, vegetables, and ground pork.",40000),
                new Dish("Shoyu Ramen","a ramen dish with a broth made of soy sauce.",30000),
                new Dish("Shio Ramen","a ramen noodle soup that has been seasoned primarily with salt, or shio in Japanese.",35000),
                new Dish("Tsukemen"," Cold noodles are dipped in the accompanying soup, broth, or sauce, which are served hot in a separate bowl.",35000),
                new Dish("Beef Ramen","  a Japanese noodle soup, with a combination of a rich flavoured broth, one of a variety of types of noodle and a selection of cow meats or vegetables, often topped with a boiled egg.",45000),
                new Dish("Teriyaki Ramen","  a Japanese noodle soup,  Japanese cooking technique in which various foods—most often chicken, but also other meat and fish—are deep fried in oil.",55000),
                new Dish("Tori Ramen","This bowl of ramen features a creamy and rich chicken paitan broth flavored with a tare, or seasoning, made from a mixture of red miso, soy sauce, sake, dried fish, kelp, and fresh red chiles.",38000)

        };



        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dishes);

        startersList.setAdapter(dishesAdapter);
    }
}