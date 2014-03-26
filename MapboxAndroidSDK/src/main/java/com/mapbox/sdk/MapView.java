package com.mapbox.sdk;

import android.util.Log;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.LinearLayout;

import com.squareup.picasso.Picasso;

/**
 * The com.mapbox.sdk.MapView class manages all of the content and
 * state of a single map, including layers, markers,
 * and interaction code.
 */
public class MapView extends ViewGroup {
    RelativeLayout mLayout;
    /**
     * Constructor for XML layout calls. Should not be used programmatically.
     *
     * @param context A copy of the app context
     * @param attrs   An AttributeSet object to get extra info from the XML, such as mapbox id or type of baselayer
     */
    public MapView(final Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public String toString() {
        return "com.mapbox.sdk.MapView()";
    }

    @Override
    protected void onLayout(final boolean changed, final int l, final int t, final int r, final int b) {
    }

    @Override
    protected void dispatchDraw(final Canvas c) {
        mLayout = new RelativeLayout(this.getContext());
        Log.i(TAG, "grid view called");
        Context context = this.getContext();
        ImageView tile = new ImageView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(256, 256);
        tile.setLayoutParams(layoutParams);
        mLayout.addView(tile);
        Picasso.with(context) //
                .load("http://tile.openstreetmap.org/0/0/0.png")
                .into(tile);
    }

    private static String TAG = "com.mapbox.sdk.MapView";
}
