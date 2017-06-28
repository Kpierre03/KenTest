// Generated code from Butter Knife. Do not modify!
package com.example.ken.kendemo17.dialog;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.example.ken.kendemo17.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class CustomDialog_ViewBinding implements Unbinder {
  private CustomDialog target;

  private View view2131558602;

  @UiThread
  public CustomDialog_ViewBinding(CustomDialog target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public CustomDialog_ViewBinding(final CustomDialog target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.dialog_custom_ok, "method 'ok'");
    view2131558602 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.ok(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    target = null;


    view2131558602.setOnClickListener(null);
    view2131558602 = null;
  }
}
