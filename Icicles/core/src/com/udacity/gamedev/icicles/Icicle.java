package com.udacity.gamedev.icicles;


import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector2;


/**
 * Created by Andrew Polanco on 5/23/2016.
 */
public class Icicle {
    public static final String TAG = Icicle.class.getName();

    Vector2 position;

    public Icicle(Vector2 pos)
    {
        position = pos;
    }

    public void render(ShapeRenderer renderer)
    {
        renderer.setColor(Constants.ICICLE_COLOR);
        renderer.set(ShapeRenderer.ShapeType.Filled);
        renderer.triangle(
                position.x, position.y,
                position.x - Constants.ICICLES_WIDTH / 2, position.y + Constants.ICICLES_HEIGHT,
                position.x + Constants.ICICLES_WIDTH / 2, position.y + Constants.ICICLES_HEIGHT
        );
    }

}
