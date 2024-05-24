package com.merebapps.engine.input.touch;

import android.view.View;

import com.merebapps.engine.input.InputController;

import java.util.List;

/**
 * Created by Oscar Liang on 2022/12/11
 */

public interface TouchController extends InputController, View.OnTouchListener {

    float getTouchX();

    float getTouchY();

    boolean isTouchDown();

    List<TouchEvent> getTouchEvents();

}
