package com.example.tugasp5;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FragmentContact extends Fragment {

    View v;
    private RecyclerView myrecyclerview;
    private List<Contact> contactPertama;

    public FragmentContact(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v =inflater.inflate(R.layout.contact_fragment, container,false);
        myrecyclerview = (RecyclerView) v.findViewById(R.id.contact_recyclerview);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(),contactPertama);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerViewAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        contactPertama = new ArrayList<>();
        contactPertama.add(new Contact("Haya Dieni", "(0812) 12312312","Pemilik HP", R.drawable.images));
        contactPertama.add(new Contact("Salsabila Filsafati", "(0812) 23939270","Teman Pemilik HP", R.drawable.download));
        contactPertama.add(new Contact("Yesyua Leon", "(0812) 23323443","Teman lain pemilik HP", R.drawable.imagesk));
        contactPertama.add(new Contact("Zahra Suhita", "(0812) 5673467","Teman SMA pemilik HP", R.drawable.download));
        contactPertama.add(new Contact("Ceycil Faradilla", "(0812) 39472478","Teman SMA peemilik HP", R.drawable.images));
        contactPertama.add(new Contact("Farah", "(0812) 73846573","Teman pemilik hp waktu SMA", R.drawable.ic_baseline_person_24));
        contactPertama.add(new Contact("Nadea", "(0812) 5364716","Sama kayak Farah, ceycil, suhik", R.drawable.imagesk));
        contactPertama.add(new Contact("Ipeh", "(0812) 22223343","sama kayak nadea", R.drawable.ic_baseline_person_24));
        contactPertama.add(new Contact("Jawed", "(0812) 00986637","temannya suhik di kuliah", R.drawable.images));
        contactPertama.add(new Contact("Lita", "(0812) 36637789","temannya suhik di kuliah juga", R.drawable.download));
        contactPertama.add(new Contact("Wanda", "(0812) 33558800","ini character di marvel yang jadi scarllet witch", R.drawable.ic_baseline_person_24));



    }
}

