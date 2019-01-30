package com.nipon.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Hero> heroList;

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        heroList = new ArrayList<>();
        listView = (ListView) findViewById(R.id.listView);

        Hero hero1=new Hero(R.drawable.ic_launcher_background, "Spiderman", "Avengers");
        heroList.add(hero1);
        heroList.add(new Hero(R.drawable.ic_launcher_background, "Joker", "Injustice Gang"));
        heroList.add(new Hero(R.drawable.ic_launcher_background, "Iron Man", "Avengers"));
        heroList.add(new Hero(R.drawable.ic_launcher_background, "Doctor Strange", "Avengers"));
        heroList.add(new Hero(R.drawable.ic_launcher_background, "Captain America", "Avengers"));
        heroList.add(new Hero(R.drawable.ic_launcher_background, "Batman", "Justice League"));

        MyListAdapter adapter = new MyListAdapter(this, R.layout.my_custom_list, heroList);
        listView.setAdapter(adapter);

    }
}
