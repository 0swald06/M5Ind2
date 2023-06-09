package com.example.m5ind2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.m5ind2.databinding.ActivityMainBinding;
import com.example.m5ind2.databinding.FragmentPokemonBinding;
import com.example.m5ind2.databinding.FragmentQuestionBinding;
import com.example.m5ind2.databinding.FragmentStartBinding;


public class FragmentPokemon extends Fragment {
    private @NonNull FragmentPokemonBinding mBinding;
    private FragmentQuestionBinding mBinding2;
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public FragmentPokemon() {
        // Required empty public constructor
    }


    public static FragmentPokemon newInstance(String param1, String param2) {
        FragmentPokemon fragment = new FragmentPokemon();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mBinding = FragmentPokemonBinding.inflate(inflater,container,false);

        mBinding.regresar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager=getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.PokemonFragment,StartFragment.newInstance("Hola","Hola"));
                fragmentTransaction.commit();
                mBinding.regresar.setVisibility(View.GONE);
                mBinding.imageView.setVisibility(View.GONE);
            }
        });
        return mBinding.getRoot();
    }
}