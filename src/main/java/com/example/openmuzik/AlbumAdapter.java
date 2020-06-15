package com.example.openmuzik;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class AlbumAdapter extends ArrayAdapter<AlbumDetail> {

    public AlbumAdapter(Context context, ArrayList<AlbumDetail> arrayAdapter) {

        super(context, 0, arrayAdapter);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View currentListView = convertView;
        if (currentListView == null) {
            currentListView = LayoutInflater.from(getContext()).inflate(R.layout.music_list_view, parent, false);
        }

        AlbumDetail albumDetail = getItem(position);

        TextView textView = currentListView.findViewById(R.id.listViewArtistName);
        textView.setText(albumDetail.getArtistName());

        TextView textView2 = currentListView.findViewById(R.id.listViewMusicName);
        textView2.setText(albumDetail.getMusicName());

        ImageView imageView = currentListView.findViewById(R.id.list_item_icon);
        imageView.setImageResource(albumDetail.getImageId());

        return currentListView;
    }
}
