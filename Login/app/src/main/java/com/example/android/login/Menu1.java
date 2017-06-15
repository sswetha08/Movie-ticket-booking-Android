package com.example.android.login;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import static com.example.android.login.R.layout.fragment_menu_1;


public class Menu1 extends Fragment {
public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //returning our layout file

        View v = inflater.inflate(fragment_menu_1, container, false);

        return inflater.inflate(fragment_menu_1, container, false);
        }


@Override
public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("Movies");
        }


        }