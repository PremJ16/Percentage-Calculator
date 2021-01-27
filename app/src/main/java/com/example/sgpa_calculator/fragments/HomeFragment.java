package com.example.sgpa_calculator.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.example.sgpa_calculator.MainActivity;
import com.example.sgpa_calculator.R;
import com.example.sgpa_calculator.helpers.FragmentHelper;

public class HomeFragment extends Fragment {

    //view
    private View view;

    //objects
    private ImageView ivWelcomeGif;
    private Button btNext;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        view=inflater.inflate(R.layout.fragment_home,container,false);
        initViews();
        return view;
    }

    private void initViews(){
        ivWelcomeGif=(ImageView) view.findViewById(R.id.f_home_iv_welcome_gif);
        btNext=(Button) view.findViewById(R.id.f_home_bt_next);
        Glide.with(view).load(R.drawable.welcome).into(ivWelcomeGif);

        btNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity) getActivity()).gotoDisplayFragment(FragmentHelper.REPLACE_FRAGMENT,false,
                        null);
            }
        });
    }

}
