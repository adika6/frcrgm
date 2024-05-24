package com.merebapps.engine.engine;

import android.graphics.Canvas;

import com.merebapps.engine.camera.Camera;
import com.merebapps.engine.entity.Updatable;

/**
 * Created by Oscar Liang on 2022/12/11
 */

public interface EngineListener {

    default void onEngineUpdate(long elapsedMillis) {
    }

    default void onEngineDraw(Canvas canvas, Camera camera) {
    }

    default void onAddToEngine(Updatable updatable) {
    }

    default void onRemoveFromEngine(Updatable updatable) {
    }

}
