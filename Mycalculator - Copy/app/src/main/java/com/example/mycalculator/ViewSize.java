package com.example.mycalculator;



import android.content.Context;

// estimate the width and height of an element based on screen size or given value
public class ViewSize {

    final static float LOW_LEVEL = 0.75f;
    final static float MEDIUM_LEVEL = 1.0f;
    final static float HIGH_LEVEL = 1.5f;
    final static float X_HIGH_LEVEL = 2.0f;
    final static float XX_HIGH_LEVEL = 3.0f;
    final static float XXX_HIGH_LEVEL = 4.0f;

    static public float computeWidth(float widthInMediumDensity, Context context) {

        float level = context.getApplicationContext().getResources().getDisplayMetrics().density;

        if (level == LOW_LEVEL) {
            return widthInMediumDensity * LOW_LEVEL;
        }

        else if (level == MEDIUM_LEVEL) {
            return widthInMediumDensity;
        }

        else if (level == HIGH_LEVEL) {
            return widthInMediumDensity * HIGH_LEVEL;
        }

        else if (level == X_HIGH_LEVEL) {
            return widthInMediumDensity * X_HIGH_LEVEL;
        }

        else if (level == XX_HIGH_LEVEL) {
            return widthInMediumDensity * XX_HIGH_LEVEL;
        }

        else if (level == XXX_HIGH_LEVEL) {
            return widthInMediumDensity * XXX_HIGH_LEVEL;
        }

        else {
            return widthInMediumDensity;
        }
    }

    static public float computeHeight(float heightInMediumDensity, Context context) {

        float level = context.getApplicationContext().getResources().getDisplayMetrics().density;

        if (level == LOW_LEVEL) {
            return heightInMediumDensity * LOW_LEVEL;
        }

        else if (level == MEDIUM_LEVEL) {
            return heightInMediumDensity;
        }

        else if (level == HIGH_LEVEL) {
            return heightInMediumDensity * HIGH_LEVEL;
        }

        else if (level == X_HIGH_LEVEL) {
            return heightInMediumDensity * X_HIGH_LEVEL;
        }

        else if (level == XX_HIGH_LEVEL) {
            return heightInMediumDensity * XX_HIGH_LEVEL;
        }

        else if (level == XXX_HIGH_LEVEL) {
            return heightInMediumDensity * XXX_HIGH_LEVEL;
        }

        else {
            return heightInMediumDensity;
        }
    }
}