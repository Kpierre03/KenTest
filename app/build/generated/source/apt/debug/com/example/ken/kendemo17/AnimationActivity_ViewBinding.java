// Generated code from Butter Knife. Do not modify!
package com.example.ken.kendemo17;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AnimationActivity_ViewBinding implements Unbinder {
  private AnimationActivity target;

  private View view2131558534;

  private View view2131558535;

  private View view2131558536;

  private View view2131558537;

  private View view2131558538;

  @UiThread
  public AnimationActivity_ViewBinding(AnimationActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AnimationActivity_ViewBinding(final AnimationActivity target, View source) {
    this.target = target;

    View view;
    target.textView = Utils.findRequiredViewAsType(source, R.id.anim_tv, "field 'textView'", TextView.class);
    view = Utils.findRequiredView(source, R.id.bt_alpha, "method 'alpha'");
    view2131558534 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.alpha(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.bt_scale, "method 'scale'");
    view2131558535 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.scale(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.bt_rotate, "method 'rotate'");
    view2131558536 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.rotate(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.bt_trans, "method 'trans'");
    view2131558537 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.trans(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.bt_set, "method 'set'");
    view2131558538 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.set(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    AnimationActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.textView = null;

    view2131558534.setOnClickListener(null);
    view2131558534 = null;
    view2131558535.setOnClickListener(null);
    view2131558535 = null;
    view2131558536.setOnClickListener(null);
    view2131558536 = null;
    view2131558537.setOnClickListener(null);
    view2131558537 = null;
    view2131558538.setOnClickListener(null);
    view2131558538 = null;
  }
}
