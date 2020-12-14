package com.classy.class_2021a_and_7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.location.Location;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.nio.charset.CoderMalfunctionError;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView main_LST_names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Post> posts = MockDB.generatePosts();
        main_LST_names = findViewById(R.id.main_LST_names);

        main_LST_names.setLayoutManager(new LinearLayoutManager(this));
        Adapter_Post adapter_post = new Adapter_Post(this, posts);
        adapter_post.setClickListener(new Adapter_Post.ItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(MainActivity.this, "Position " + position, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onReportClick(int position) {
                Toast.makeText(MainActivity.this, "Report " + position, Toast.LENGTH_SHORT).show();

            }
        });
        main_LST_names.setAdapter(adapter_post);





    }
}