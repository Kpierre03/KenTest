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

public class RadioGroupActivity_ViewBinding implements Unbinder {
  private RadioGroupActivity target;

  private View view2131558584;

  @UiThread
  public RadioGroupActivity_ViewBinding(RadioGroupActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public RadioGroupActivity_ViewBinding(final RadioGroupActivity target, View source) {
    this.target = target;

    View view;
    target.radioGroup = Utils.findRequiredViewAsType(source, R.id.activity_radio_group, "field 'radioGroup'", RadioGroup.class);
    view = Utils.findRequiredView(source, R.id.activity_radio_group_submit, "method 'submit'");
    view2131558584 = view;
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
    RadioGroupActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.radioGroup = null;

    view2131558584.setOnClickListener(null);
    view2131558584 = null;
  }
}
