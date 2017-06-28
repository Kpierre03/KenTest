package com.example.ken.kendemo17;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AnimationActivity extends BaseActivity {

    private Animation alphaAnimation;
    private Animation scaleAnimation;
    private Animation rotateAnimation;
    private Animation transAnimation;
    private Animation setAnimation;

    @BindView(R.id.anim_tv)TextView textView;

    @OnClick(R.id.bt_alpha)
    public void alpha(View v){
        textView.startAnimation(alphaAnimation);
    }

    @OnClick(R.id.bt_scale)
    public void scale(View v){
        textView.startAnimation(scaleAnimation);
    }

    @OnClick(R.id.bt_rotate)
    public void rotate(View v){
        textView.startAnimation(rotateAnimation);
    }
    @OnClick(R.id.bt_trans)
    public void trans(View v){
        textView.startAnimation(transAnimation);
    }
    @OnClick(R.id.bt_set)
    public void set(View v){
        textView.startAnimation(setAnimation);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        ButterKnife.bind(this);
        initialAnimation();
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shortToast("You clicked TextView");
            }
        });
    }

    private void initialAnimation() {
        alphaAnimation = AnimationUtils.loadAnimation(this, R.anim.anim_alpha);
        scaleAnimation = AnimationUtils.loadAnimation(this, R.anim.anim_scale);;
        rotateAnimation = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
        transAnimation = AnimationUtils.loadAnimation(this, R.anim.anim_trans);
        setAnimation = AnimationUtils.loadAnimation(this, R.anim.anim_set);
    }
}
