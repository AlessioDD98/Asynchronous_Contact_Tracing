// Generated by view binder compiler. Do not edit!
package com.vrem.wifianalyzer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.vrem.wifianalyzer.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FilterSecurityBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout filterSecurity;

  @NonNull
  public final TextView filterSecurityNone;

  @NonNull
  public final TextView filterSecurityWEP;

  @NonNull
  public final TextView filterSecurityWPA;

  @NonNull
  public final TextView filterSecurityWPA2;

  @NonNull
  public final TextView filterSecurityWPA3;

  @NonNull
  public final TextView filterSecurityWPS;

  private FilterSecurityBinding(@NonNull LinearLayout rootView,
      @NonNull LinearLayout filterSecurity, @NonNull TextView filterSecurityNone,
      @NonNull TextView filterSecurityWEP, @NonNull TextView filterSecurityWPA,
      @NonNull TextView filterSecurityWPA2, @NonNull TextView filterSecurityWPA3,
      @NonNull TextView filterSecurityWPS) {
    this.rootView = rootView;
    this.filterSecurity = filterSecurity;
    this.filterSecurityNone = filterSecurityNone;
    this.filterSecurityWEP = filterSecurityWEP;
    this.filterSecurityWPA = filterSecurityWPA;
    this.filterSecurityWPA2 = filterSecurityWPA2;
    this.filterSecurityWPA3 = filterSecurityWPA3;
    this.filterSecurityWPS = filterSecurityWPS;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FilterSecurityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FilterSecurityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.filter_security, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FilterSecurityBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      LinearLayout filterSecurity = (LinearLayout) rootView;

      id = R.id.filterSecurityNone;
      TextView filterSecurityNone = ViewBindings.findChildViewById(rootView, id);
      if (filterSecurityNone == null) {
        break missingId;
      }

      id = R.id.filterSecurityWEP;
      TextView filterSecurityWEP = ViewBindings.findChildViewById(rootView, id);
      if (filterSecurityWEP == null) {
        break missingId;
      }

      id = R.id.filterSecurityWPA;
      TextView filterSecurityWPA = ViewBindings.findChildViewById(rootView, id);
      if (filterSecurityWPA == null) {
        break missingId;
      }

      id = R.id.filterSecurityWPA2;
      TextView filterSecurityWPA2 = ViewBindings.findChildViewById(rootView, id);
      if (filterSecurityWPA2 == null) {
        break missingId;
      }

      id = R.id.filterSecurityWPA3;
      TextView filterSecurityWPA3 = ViewBindings.findChildViewById(rootView, id);
      if (filterSecurityWPA3 == null) {
        break missingId;
      }

      id = R.id.filterSecurityWPS;
      TextView filterSecurityWPS = ViewBindings.findChildViewById(rootView, id);
      if (filterSecurityWPS == null) {
        break missingId;
      }

      return new FilterSecurityBinding((LinearLayout) rootView, filterSecurity, filterSecurityNone,
          filterSecurityWEP, filterSecurityWPA, filterSecurityWPA2, filterSecurityWPA3,
          filterSecurityWPS);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}