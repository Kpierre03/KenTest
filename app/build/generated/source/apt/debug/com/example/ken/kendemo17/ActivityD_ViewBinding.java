// Generated code from Butter Knife. Do not modify!
package com.example.ken.kendemo17;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ActivityD_ViewBinding implements Unbinder {
  private ActivityD target;

  private View view2131558558;

  private View view2131558559;

  private View view2131558560;

  private View view2131558561;

  @UiThread
  public ActivityD_ViewBinding(ActivityD target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ActivityD_ViewBinding(final ActivityD target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.activity_d_a, "method 'toA'");
    view2131558558 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.toA(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.activity_d_b, "method 'toB'");
    view2131558559 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.toB(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.activity_d_c, "method 'toC'");
    view2131558560 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.toC(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.activity_d_d, "method 'toD'");
    view2131558561 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.toD(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    target = null;


    view2131558558.setOnClickListener(null);
    view2131558558 = null;
    view2131558559.setOnClickListener(null);
    view2131558559 = null;
    view2131558560.setOnClickListener(null);
    view2131558560 = null;
    view2131558561.setOnClickListener(null);
    view2131558561 = null;
  }
}
