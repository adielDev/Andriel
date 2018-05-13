package com.andriel.widjets;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.andriel.R;
import com.andriel.widjets.frags.SpinnerFragment;

public class FragsWidgetAct extends AppCompatActivity {


    public static final String EXTRA_WHICH_FRAG = "extra_which_frag";

    public static Intent getCallingIntent(Context context, String whichFRag) {
        Intent intent = new Intent(context, FragsWidgetAct.class);
        intent.putExtra(EXTRA_WHICH_FRAG, whichFRag);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frags_widget);
        String whichFRag = getIntent().getStringExtra(EXTRA_WHICH_FRAG);
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragContainer,getFRag(whichFRag) );
        fragmentTransaction.commit();
    }

    private Fragment getFRag(String which) {

        Fragment fragment = null;
        switch (which) {

            case "Spinner":
                fragment = new SpinnerFragment();
                break;

        }

        return fragment;
    }
}
