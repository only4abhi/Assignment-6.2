package com.example.abhishek.assignment62;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Fragment1.OnNameSetListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        Fragment2 f2 = new Fragment2();
        fragmentTransaction.add(R.id.fragment_container, f2);
        fragmentTransaction.commit();
    }


    @Override
    public void setName(String name) {
        Fragment2 f2 = (Fragment2)getFragmentManager().findFragmentById(R.id.fragment_container);
        f2.updateInfo(name);
    }
}
