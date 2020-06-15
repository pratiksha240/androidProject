package com.example.fragmentassignment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag4 extends Fragment {

    public Frag4() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_frag4, container, false);
        Button next = (Button) view.findViewById(R.id.button5);
        Button previous = (Button) view.findViewById(R.id.button6);
        next.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.my_layout, new Frag5());
                ft.addToBackStack(null);
                ft.commit();
            }
        });

        previous.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.my_layout, new Frag3());
                ft.addToBackStack(null);
                ft.commit();
            }
        });
        return view;
    }
}
