package com.example.openmuzik;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class GlobalFamous extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_list);

        ArrayList<AlbumDetail> albumList = new ArrayList<>();

        albumList.add(new AlbumDetail("Drake", "God's Plan", R.drawable.global));
        albumList.add(new AlbumDetail("Martin Garrix", "High On Life", R.drawable.global));
        albumList.add(new AlbumDetail("Closer", "The Chainsmokers", R.drawable.global));
        albumList.add(new AlbumDetail("Artist1", "Music 1", R.drawable.global));
        albumList.add(new AlbumDetail("Artist2", "Music 2", R.drawable.global));
        albumList.add(new AlbumDetail("Artist3", "Music 3", R.drawable.global));
        albumList.add(new AlbumDetail("Artist4", "Music 4", R.drawable.global));
        albumList.add(new AlbumDetail("Artist5", "Music 5", R.drawable.global));
        albumList.add(new AlbumDetail("Artist6", "Music 6", R.drawable.global));
        albumList.add(new AlbumDetail("Artist7", "Music 7", R.drawable.global));
        albumList.add(new AlbumDetail("Artist8", "Music 8", R.drawable.global));
        albumList.add(new AlbumDetail("Artist9", "Music 9", R.drawable.global));
        albumList.add(new AlbumDetail("Artist10", "Music 10", R.drawable.global));
        albumList.add(new AlbumDetail("Artist11", "Music 11", R.drawable.global));
        albumList.add(new AlbumDetail("Artist12", "Music 12", R.drawable.global));


        AlbumAdapter albumAdapter = new AlbumAdapter(this, albumList);

        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(albumAdapter);


    }
}
