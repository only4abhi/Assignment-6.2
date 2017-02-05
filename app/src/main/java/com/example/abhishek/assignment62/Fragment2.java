package com.example.abhishek.assignment62;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment2 extends Fragment {

    private TextView mtxtview;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment2, container, false);
      /*
        Bundle bundle = getArguments();
        String laydet = bundle.getString("Layout");

        mtxtview = (TextView)view.findViewById(R.id.textView1);
        mtxtview.setText(laydet);
      */
        return view;
    }

   public void updateInfo(String name){
       mtxtview.setText(name);
   }
}
