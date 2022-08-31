// Generated by view binder compiler. Do not edit!
package com.vrem.wifianalyzer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.vrem.wifianalyzer.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class MainContentBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button buttonBackup;

  @NonNull
  public final FrameLayout mainFragment;

  @NonNull
  public final BottomNavigationView navBottom;

  private MainContentBinding(@NonNull LinearLayout rootView, @NonNull Button buttonBackup,
      @NonNull FrameLayout mainFragment, @NonNull BottomNavigationView navBottom) {
    this.rootView = rootView;
    this.buttonBackup = buttonBackup;
    this.mainFragment = mainFragment;
    this.navBottom = navBottom;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static MainContentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MainContentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.main_content, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MainContentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonBackup;
      Button buttonBackup = ViewBindings.findChildViewById(rootView, id);
      if (buttonBackup == null) {
        break missingId;
      }

      id = R.id.main_fragment;
      FrameLayout mainFragment = ViewBindings.findChildViewById(rootView, id);
      if (mainFragment == null) {
        break missingId;
      }

      id = R.id.nav_bottom;
      BottomNavigationView navBottom = ViewBindings.findChildViewById(rootView, id);
      if (navBottom == null) {
        break missingId;
      }

      return new MainContentBinding((LinearLayout) rootView, buttonBackup, mainFragment, navBottom);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
