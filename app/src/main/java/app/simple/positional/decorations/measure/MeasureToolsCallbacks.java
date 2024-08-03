package app.simple.positional.decorations.measure;

import android.view.View;

public interface MeasureToolsCallbacks {
    void onLocation(View view, boolean reset);

    void onWrap(View view);

    void onNewAdd(View view);

    void onClearRecentMarker(View view);
}
