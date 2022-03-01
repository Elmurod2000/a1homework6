package com.example.a1homework6;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a1homework6.databinding.FragmentSecondBinding;

import java.util.ArrayList;

public class SecondFragment extends Fragment implements OnItemClick{

    private FragmentSecondBinding binding;
    private ArrayList<Model> list;
    SongsAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentSecondBinding.inflate(LayoutInflater.from(getContext()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        loadData();
        SongsAdapter adapter = new SongsAdapter(list, this::onlick);
        binding.rvSongs.setAdapter(adapter);



    }

    private void loadData() {
        list = new ArrayList<>();
        list.add(new Model("1", "Blank Space", "Taylor Swift", "3:22"));
        list.add(new Model("2", "Watch me", "Silento", "5:36"));
        list.add(new Model("3", "Earned It", "The Weekend", "4:51"));
        list.add(new Model("4", "The Hills", "The Weekend", "3:41"));
        list.add(new Model("5", "Writing's On The Wall" , "The Weekend", "4:54"));
        list.add(new Model("6", "Writing's On The Wall" , "The Weekend", "4:54"));
        list.add(new Model("7", "Writing's On The Wall" , "The Weekend", "4:54"));
        list.add(new Model("8", "Writing's On The Wall" , "The Weekend", "4:54"));
        list.add(new Model("9", "Writing's On The Wall" , "The Weekend", "4:54"));
        list.add(new Model("10", "Writing's On The Wall" , "The Weekend", "4:54"));

    }

    @Override
    public void onlick(Model model) {
            Intent intent = new Intent(getActivity(), MainActivity2.class);
            intent.putExtra("key", model.getSongs());
            startActivity(intent);
    }
}