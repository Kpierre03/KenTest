// Generated code from Butter Knife. Do not modify!
package com.example.ken.kendemo17.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ListView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.ken.kendemo17.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AdvanceActivity_ViewBinding implements Unbinder {
  private AdvanceActivity target;

  @UiThread
  public AdvanceActivity_ViewBinding(AdvanceActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AdvanceActivity_ViewBinding(AdvanceActivity target, View source) {
    this.target = target;

    target.lv = Utils.findRequiredViewAsType(source, R.id.activity_advance_list_view, "field 'lv'", ListView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AdvanceActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.lv = null;
  }
}
