package androidx.transition;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import android.view.View;
import android.view.ViewOverlay;

@RequiresApi(18)
class ViewOverlayApi18 implements ViewOverlayImpl {
    private final ViewOverlay mViewOverlay;

    ViewOverlayApi18(@NonNull View view) {
        this.mViewOverlay = view.getOverlay();
    }

    public void add(@NonNull Drawable drawable) {
        this.mViewOverlay.add(drawable);
    }

    public void clear() {
        this.mViewOverlay.clear();
    }

    public void remove(@NonNull Drawable drawable) {
        this.mViewOverlay.remove(drawable);
    }
}
