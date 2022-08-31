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

public final class ChannelAvailableDetailsBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView channelAvailableCountry;

  @NonNull
  public final TextView channelAvailableGhz2;

  @NonNull
  public final TextView channelAvailableGhz5;

  @NonNull
  public final TextView channelAvailableGhz6;

  @NonNull
  public final TextView channelAvailableTitleGhz2;

  @NonNull
  public final TextView channelAvailableTitleGhz5;

  @NonNull
  public final TextView channelAvailableTitleGhz6;

  private ChannelAvailableDetailsBinding(@NonNull LinearLayout rootView,
      @NonNull TextView channelAvailableCountry, @NonNull TextView channelAvailableGhz2,
      @NonNull TextView channelAvailableGhz5, @NonNull TextView channelAvailableGhz6,
      @NonNull TextView channelAvailableTitleGhz2, @NonNull TextView channelAvailableTitleGhz5,
      @NonNull TextView channelAvailableTitleGhz6) {
    this.rootView = rootView;
    this.channelAvailableCountry = channelAvailableCountry;
    this.channelAvailableGhz2 = channelAvailableGhz2;
    this.channelAvailableGhz5 = channelAvailableGhz5;
    this.channelAvailableGhz6 = channelAvailableGhz6;
    this.channelAvailableTitleGhz2 = channelAvailableTitleGhz2;
    this.channelAvailableTitleGhz5 = channelAvailableTitleGhz5;
    this.channelAvailableTitleGhz6 = channelAvailableTitleGhz6;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ChannelAvailableDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ChannelAvailableDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.channel_available_details, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ChannelAvailableDetailsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.channel_available_country;
      TextView channelAvailableCountry = ViewBindings.findChildViewById(rootView, id);
      if (channelAvailableCountry == null) {
        break missingId;
      }

      id = R.id.channel_available_ghz_2;
      TextView channelAvailableGhz2 = ViewBindings.findChildViewById(rootView, id);
      if (channelAvailableGhz2 == null) {
        break missingId;
      }

      id = R.id.channel_available_ghz_5;
      TextView channelAvailableGhz5 = ViewBindings.findChildViewById(rootView, id);
      if (channelAvailableGhz5 == null) {
        break missingId;
      }

      id = R.id.channel_available_ghz_6;
      TextView channelAvailableGhz6 = ViewBindings.findChildViewById(rootView, id);
      if (channelAvailableGhz6 == null) {
        break missingId;
      }

      id = R.id.channel_available_title_ghz_2;
      TextView channelAvailableTitleGhz2 = ViewBindings.findChildViewById(rootView, id);
      if (channelAvailableTitleGhz2 == null) {
        break missingId;
      }

      id = R.id.channel_available_title_ghz_5;
      TextView channelAvailableTitleGhz5 = ViewBindings.findChildViewById(rootView, id);
      if (channelAvailableTitleGhz5 == null) {
        break missingId;
      }

      id = R.id.channel_available_title_ghz_6;
      TextView channelAvailableTitleGhz6 = ViewBindings.findChildViewById(rootView, id);
      if (channelAvailableTitleGhz6 == null) {
        break missingId;
      }

      return new ChannelAvailableDetailsBinding((LinearLayout) rootView, channelAvailableCountry,
          channelAvailableGhz2, channelAvailableGhz5, channelAvailableGhz6,
          channelAvailableTitleGhz2, channelAvailableTitleGhz5, channelAvailableTitleGhz6);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}