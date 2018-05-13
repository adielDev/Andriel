package com.andriel.widjets.frags;


import android.database.DataSetObserver;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

import com.andriel.R;
import com.andriel.widjets.custom.CustomSpinner;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class SpinnerFragment extends Fragment {


    public SpinnerFragment() {
        // Required empty public constructor
    }


    CustomSpinner sp1;
    Spinner sp0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_spinner, container, false);
        sp0 = rootView.findViewById(R.id.sp0);
        sp1 = rootView.findViewById(R.id.sp1);
        List<String> list = new ArrayList<String>();
        list.add("list 1");
        list.add("list 2");
        list.add("list 3");
        list.add("list 3");
        list.add("list 3");
        list.add("list 3");
        list.add("list 3");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(getContext(),
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp1.setAdapter(dataAdapter);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(),
                android.R.layout.simple_spinner_item, paths);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp0.setAdapter(adapter);
        sp0.setAdapter(dataAdapter);

        return rootView;
    }

    private static final String[] paths = {"item 1", "item 2", "item 3"};

}
