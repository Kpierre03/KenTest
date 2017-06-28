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

public class NotificationActivity_ViewBinding implements Unbinder {
  private NotificationActivity target;

  private View view2131558580;

  private View view2131558581;

  private View view2131558582;

  @UiThread
  public NotificationActivity_ViewBinding(NotificationActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public NotificationActivity_ViewBinding(final NotificationActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.activity_notification_small, "method 'smallNotification'");
    view2131558580 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.smallNotification(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.activity_notification_big, "method 'bigNotification'");
    view2131558581 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.bigNotification(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.activity_notification_pic, "method 'picNotification'");
    view2131558582 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.picNotification(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    target = null;


    view2131558580.setOnClickListener(null);
    view2131558580 = null;
    view2131558581.setOnClickListener(null);
    view2131558581 = null;
    view2131558582.setOnClickListener(null);
    view2131558582 = null;
  }
}
