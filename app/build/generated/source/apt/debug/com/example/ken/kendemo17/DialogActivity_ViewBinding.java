// Generated code from Butter Knife. Do not modify!
package com.example.ken.kendemo17;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.RadioGroup;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DialogActivity_ViewBinding implements Unbinder {
  private DialogActivity target;

  private View view2131558571;

  @UiThread
  public DialogActivity_ViewBinding(DialogActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public DialogActivity_ViewBinding(final DialogActivity target, View source) {
    this.target = target;

    View view;
    target.radioGroup = Utils.findRequiredViewAsType(source, R.id.activity_dialog, "field 'radioGroup'", RadioGroup.class);
    view = Utils.findRequiredView(source, R.id.activity_dialog_ok, "method 'ok'");
    view2131558571 = view;
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
    DialogActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.radioGroup = null;

    view2131558571.setOnClickListener(null);
    view2131558571 = null;
  }
}
