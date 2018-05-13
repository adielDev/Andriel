package com.andriel.widjets.frags;


import android.content.Context;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

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
    Spinner sp2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_spinner, container, false);
        sp0 = rootView.findViewById(R.id.sp0);
        sp1 = rootView.findViewById(R.id.sp1);
        sp2 = rootView.findViewById(R.id.sp2);
        List<String> list = new ArrayList<String>();
        list.add("list 1");
        list.add("list 2");
        list.add("list 3");
        list.add("list 3vdsgvsbfsbhrfnbdnngtrf");
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
        sp2.setAdapter(adapter);


        MyAdapter1 myAdapter1 = new MyAdapter1(getContext(), android.R.layout.simple_spinner_item, paths);

        sp0.setAdapter(myAdapter1);
        // sp0.setAdapter(dataAdapter);

        return rootView;
    }

    private static final String[] paths = {"item 1", "item 2", "item 3"};

    public static class MyAdapter1 extends ArrayAdapter<String> implements SpinnerAdapter {


        String[] objects;

        public MyAdapter1(@NonNull Context context, int resource, @NonNull String[] objects) {
            super(context, resource, objects);
            this.objects = objects;
        }


        @Override
        public View getDropDownView(int position, View convertView, ViewGroup parent) {
            TextView textView = new TextView(getContext());
            textView.setText("##### " + position + " #######" + " " + objects[position]);
            return textView;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            TextView textView = new TextView(getContext());
            textView.setText("&&&&&& " + position + " &&&&&&&" + " " + objects[position]);
            return textView;
        }


    }

    public static class MySpinnerAdapter implements SpinnerAdapter {

        @Override
        public View getDropDownView(int position, View convertView, ViewGroup parent) {
            return null;
        }

        @Override
        public void registerDataSetObserver(DataSetObserver observer) {

        }

        @Override
        public void unregisterDataSetObserver(DataSetObserver observer) {

        }

        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public boolean hasStableIds() {
            return false;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            return null;
        }

        @Override
        public int getItemViewType(int position) {
            return 0;
        }

        @Override
        public int getViewTypeCount() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }
    }

}
