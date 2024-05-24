package com.merebapps.engine.input.touch;

import com.merebapps.engine.camera.Camera;

/**
 * Created by Oscar Liang on 2022/12/11
 */

public interface TouchEventListener {

    default Camera.CoordinateType getCoordinateType() {
        return Camera.CoordinateType.WORLD;
    }

    void onTouchEvent(int type, float touchX, float touchY);

}
