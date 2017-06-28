// Generated code from Butter Knife. Do not modify!
package com.example.ken.kendemo17;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ListView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AdvanceListViewActivity_ViewBinding implements Unbinder {
  private AdvanceListViewActivity target;

  @UiThread
  public AdvanceListViewActivity_ViewBinding(AdvanceListViewActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AdvanceListViewActivity_ViewBinding(AdvanceListViewActivity target, View source) {
    this.target = target;

    target.lv = Utils.findRequiredViewAsType(source, R.id.activity_advance_list_view, "field 'lv'", ListView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AdvanceListViewActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.lv = null;
  }
}
