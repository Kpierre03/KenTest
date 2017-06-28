// Generated code from Butter Knife. Do not modify!
package com.example.ken.kendemo17;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.CheckBox;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class CheckBoxActivity_ViewBinding implements Unbinder {
  private CheckBoxActivity target;

  private View view2131558555;

  @UiThread
  public CheckBoxActivity_ViewBinding(CheckBoxActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public CheckBoxActivity_ViewBinding(final CheckBoxActivity target, View source) {
    this.target = target;

    View view;
    target.checkBox1 = Utils.findRequiredViewAsType(source, R.id.activity_check_box_1, "field 'checkBox1'", CheckBox.class);
    target.checkBox2 = Utils.findRequiredViewAsType(source, R.id.activity_check_box_2, "field 'checkBox2'", CheckBox.class);
    target.checkBox3 = Utils.findRequiredViewAsType(source, R.id.activity_check_box_3, "field 'checkBox3'", CheckBox.class);
    view = Utils.findRequiredView(source, R.id.activity_check_box_submit, "method 'submit'");
    view2131558555 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.submit(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    CheckBoxActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.checkBox1 = null;
    target.checkBox2 = null;
    target.checkBox3 = null;

    view2131558555.setOnClickListener(null);
    view2131558555 = null;
  }
}
