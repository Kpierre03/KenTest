package com.example.ken.kendemo17.fragment;

//import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.ken.kendemo17.R;

import butterknife.OnClick;


public class WorkFragment extends Fragment {


    public WorkFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    //@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_work, container, false);

    }

    @OnClick(R.id.submit_button)
    public void clickSubmit(View v) {
        Toast.makeText(getContext(), "Submission is Successful!", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.quiz1)
    public void clickQuiz1(View v) {
        Toast.makeText(WorkFragment.this.getContext()
                , "Quiz 1: 6/19/17!", Toast.LENGTH_SHORT).show();
    }

//    public void submit(View v){
//        Toast.makeText(WorkFragment.this, "You clicked login", Toast.LENGTH_SHORT).show();
//    }


}
