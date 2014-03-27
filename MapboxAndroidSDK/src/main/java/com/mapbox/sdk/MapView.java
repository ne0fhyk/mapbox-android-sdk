package com.mapbox.sdk;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

/**
 * The com.mapbox.sdk.MapView class manages all of the content and
 * state of a single map, including layers, markers,
 * and interaction code.
 */
public class MapView extends ImageView
{
    /**
     * Constructor for XML layout calls. Should not be used programmatically.
     *
     * @param context A copy of the app context
     * @param attrs   An AttributeSet object to get extra info from the XML, such as mapbox id or type of baselayer
     */
    public MapView(final Context context, AttributeSet attrs) {
        super(context, attrs);

		Picasso.with(context) //
				.load("http://tile.openstreetmap.org/0/0/0.png")
				.into(this);
	}

    @Override
    public String toString() {
        return getClass().getCanonicalName();
    }
}
