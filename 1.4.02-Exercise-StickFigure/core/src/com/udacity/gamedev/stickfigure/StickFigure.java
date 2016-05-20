package com.udacity.gamedev.stickfigure;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector2;

/**
 * TODO: Start here
 *
 * In this exercise you'll set up a ShapeRenderer, and use it to draw a stick figure. At minimum,
 * you'll need a circle for the head, and five lines for the torso, arms, and legs.
 *
 * Remember to set up a ShapeRenderer you'll need to declare it, initialize it, and dispose of it.
 * Then to actually use the ShapeRenderer you'll need to start a batch of the appropriate type, draw
 * your shapes, and end the batch.
 *
 * We don't have step-by-step TODOs for this one, since the aim is for you to remember the steps for
 * setting up a ShapeRenderer and be able to set one up on your own. Of course, the solution is
 * available if you run into anything confusing.
 */
public class StickFigure extends ApplicationAdapter {

    ShapeRenderer renderer;
    int SCREENWIDTH;
    int SCREENHEIGHT;
    @Override
    public void create()
    {
        renderer = new ShapeRenderer();
    }

    @Override
    public void dispose()
    {
        renderer.dispose();
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        //i should of put this up earlier so this doesn't calculate everytime but w/e
        SCREENWIDTH = Gdx.graphics.getWidth();
        SCREENHEIGHT = Gdx.graphics.getHeight();
        //body
        renderer.begin(ShapeRenderer.ShapeType.Line);

        renderer.line(new Vector2((int)(SCREENWIDTH*.5),(int)(SCREENHEIGHT*.5))
                ,new Vector2((int)(SCREENWIDTH*.5),(int)(SCREENHEIGHT*.2)));
        //arms
        renderer.line(new Vector2((int)(SCREENWIDTH*.5),(int)(SCREENHEIGHT*.4))
                ,new Vector2((int)(SCREENWIDTH*.6),(int)(SCREENHEIGHT*.3)));
        renderer.line(new Vector2((int)(SCREENWIDTH*.5),(int)(SCREENHEIGHT*.4))
                ,new Vector2((int)(SCREENWIDTH*.4),(int)(SCREENHEIGHT*.3)));
        //legs
        renderer.line(new Vector2((int)(SCREENWIDTH*.5),(int)(SCREENHEIGHT*.2))
                ,new Vector2((int)(SCREENWIDTH*.55),(int)(SCREENHEIGHT*.05)));
        renderer.line(new Vector2((int)(SCREENWIDTH*.5),(int)(SCREENHEIGHT*.2))
                ,new Vector2((int)(SCREENWIDTH*.45),(int)(SCREENHEIGHT*.05)));
        renderer.end();

        //head last to go over the body
        renderer.begin(ShapeRenderer.ShapeType.Filled);
        renderer.circle((int)(SCREENWIDTH*.5),(int)(SCREENHEIGHT*.5),30);

        renderer.end();
    }
}
