package com.example.abhishek.assignment62;


import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class Fragment1 extends ListFragment implements OnItemClickListener {

    String layexm[] = {"Layout1","Layout2","Layout3","Layout4"};
    ArrayAdapter<String> adapter;
    OnNameSetListener onNameSetListener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,layexm);
        setListAdapter(adapter);
        View view = inflater.inflate(R.layout.fragment1, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        getListView().setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String layout = layexm[position];
        onNameSetListener.setName(layout);

        /*
        Bundle bundle = new Bundle();
        bundle.putString("Layout",layout);

        FragmentManager fm = getActivity().getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        Fragment2 f2 = new Fragment2();
        f2.setArguments(bundle);

        ft.add(R.id.fragment_container,f2);
        ft.commit();
        */

       //Toast.makeText(getActivity(), "Item: " + layexm[position], Toast.LENGTH_SHORT).show();
    }

    public interface OnNameSetListener{
        public void setName(String name);
    }

    @SuppressWarnings("deprecation")
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            onNameSetListener = (OnNameSetListener) activity;
        }catch (Exception e){}
    }
}
