package com.merebapps.engine.input.touch;

import com.merebapps.engine.camera.Camera;

/**
 * Created by Oscar Liang on 2022/12/11
 */

public interface BoundTouchEventListener {

    default Camera.CoordinateType getCoordinateType() {
        return Camera.CoordinateType.WORLD;
    }

    float getX();

    float getY();

    float getEndX();

    float getEndY();

    void onAreaTouchEvent(int type, float relativeTouchX, float relativeTouchY);

}
