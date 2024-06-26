package com.merebapps.engine.texture.texture2d;

import com.merebapps.engine.texture.BaseTextureGroup;

import java.util.List;

/**
 * Created by Oscar Liang on 2022/12/11
 */

public class Texture2DGroup extends BaseTextureGroup<Texture2D> {

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    public Texture2DGroup() {
        super();
    }

    public Texture2DGroup(List<Texture2D> textures) {
        super(textures);
    }
    //========================================================

}
