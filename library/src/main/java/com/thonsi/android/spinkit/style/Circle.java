package com.thonsi.android.spinkit.style;

import android.animation.ValueAnimator;
import android.os.Build;

import com.thonsi.android.spinkit.animation.SpriteAnimatorBuilder;
import com.thonsi.android.spinkit.sprite.CircleLayoutContainer;
import com.thonsi.android.spinkit.sprite.CircleSprite;
import com.thonsi.android.spinkit.sprite.Sprite;

public class Circle extends CircleLayoutContainer {

    @Override
    public Sprite[] onCreateChild() {
        Dot[] dots = new Dot[12];
        for (int i = 0; i < dots.length; i++) {
            dots[i] = new Dot();
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                dots[i].setAnimationDelay(1200 / 12 * i);
            } else {
                dots[i].setAnimationDelay(1200 / 12 * i + -1200);
            }
        }
        return dots;
    }

    private static class Dot extends CircleSprite {

        Dot() {
            setScale(0f);
        }

        @Override
        public ValueAnimator onCreateAnimation() {
            float[] fractions = new float[]{0f, 0.5f, 1f};
            return new SpriteAnimatorBuilder(this).
                    scale(fractions, 0f, 1f, 0f).
                    duration(1200).
                    easeInOut(fractions)
                    .build();
        }
    }
}
