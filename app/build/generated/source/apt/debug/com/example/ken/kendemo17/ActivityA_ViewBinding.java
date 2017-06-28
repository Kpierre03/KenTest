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

public class ActivityA_ViewBinding implements Unbinder {
  private ActivityA target;

  private View view2131558524;

  private View view2131558525;

  private View view2131558526;

  private View view2131558527;

  @UiThread
  public ActivityA_ViewBinding(ActivityA target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ActivityA_ViewBinding(final ActivityA target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.activity_a_a, "method 'toA'");
    view2131558524 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.toA(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.activity_a_b, "method 'toB'");
    view2131558525 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.toB(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.activity_a_c, "method 'toC'");
    view2131558526 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.toC(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.activity_a_d, "method 'toD'");
    view2131558527 = view;
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


    view2131558524.setOnClickListener(null);
    view2131558524 = null;
    view2131558525.setOnClickListener(null);
    view2131558525 = null;
    view2131558526.setOnClickListener(null);
    view2131558526 = null;
    view2131558527.setOnClickListener(null);
    view2131558527 = null;
  }
}
