package com.example.raghu.first;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by raghu on 4/4/17.
 */

public class fragment extends Fragment {

    ListView listView;
    ArrayAdapter<String> adapter;
    String[] versions;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment,container,false);

        listView=(ListView)view.findViewById(R.id.list);
        versions=getResources().getStringArray(R.array.list_names);
        adapter=new ArrayAdapter<String>(getActivity(),R.layout.list_view_layout,R.id.list_row,versions);
        listView.setAdapter(adapter);

        return view;
    }
}
