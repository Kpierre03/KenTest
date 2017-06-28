// Generated code from Butter Knife. Do not modify!
package com.example.ken.kendemo17;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AdvanceViewPagerActivity_ViewBinding implements Unbinder {
  private AdvanceViewPagerActivity target;

  @UiThread
  public AdvanceViewPagerActivity_ViewBinding(AdvanceViewPagerActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AdvanceViewPagerActivity_ViewBinding(AdvanceViewPagerActivity target, View source) {
    this.target = target;

    target.tabLayout = Utils.findRequiredViewAsType(source, R.id.activity_adavance_view_pager_tablayout, "field 'tabLayout'", TabLayout.class);
    target.viewPager = Utils.findRequiredViewAsType(source, R.id.activity_advance_view_pager, "field 'viewPager'", ViewPager.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AdvanceViewPagerActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tabLayout = null;
    target.viewPager = null;
  }
}
