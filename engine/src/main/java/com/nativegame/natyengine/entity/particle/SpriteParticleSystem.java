package com.merebapps.engine.entity.particle;

import com.merebapps.engine.engine.Engine;
import com.merebapps.engine.entity.sprite.Sprite;
import com.merebapps.engine.texture.Texture;
import com.merebapps.engine.util.pool.Pool;
import com.merebapps.engine.util.pool.SafeFixedObjectPool;

/**
 * Created by Oscar Liang on 2022/12/11
 */

public class SpriteParticleSystem extends GenericParticleSystem {

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    public SpriteParticleSystem(Engine engine, Texture texture, int minCount) {
        this(engine, texture, minCount, minCount);
    }

    public SpriteParticleSystem(Engine engine, Texture texture, int minCount, int maxCount) {
        super(engine, new SafeFixedObjectPool<>(new Pool.PoolObjectFactory<Particle>() {
            @Override
            public Particle createObject() {
                return new GenericParticle<>(engine, new Sprite(engine, texture));
            }
        }, minCount, maxCount));
    }
    //========================================================

}
