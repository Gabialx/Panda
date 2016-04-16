package com.example.panda.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    private ViewFlipper viewFlipper;
    private LinearLayout linearLayout;

    private float lastX;
    private float lastY;

    private float dynamicX;
    private float dynamicY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewFlipper = (ViewFlipper) findViewById(R.id.viewFlipper);
        linearLayout = (LinearLayout) findViewById(R.id.linearLayoutPage1);
    }

    // Handle screen swaps.
    public boolean dispatchTouchEvent(MotionEvent touchevent) {
        float currentX = touchevent.getX();
        float currentY = touchevent.getY();

        switch (touchevent.getAction()) {
            case MotionEvent.ACTION_DOWN: {
                lastX = currentX;
                lastY = currentY;

                dynamicX = currentX;
                dynamicY = currentY;

                break;
            }
            case MotionEvent.ACTION_UP: {

                float deltaX = delta(lastX, currentX);
                float deltaY = delta(lastY, currentY);

                if (deltaX > deltaY) {
                    // horizontal swipe
                    swipePages(currentX);
                } else {
                    // vertical swipe
//                    linearLayout.scrollBy(0, sign(lastY, currentY) * Math.round(deltaY));
                    return super.dispatchTouchEvent(touchevent);
                }
                break;
            }
            case MotionEvent.ACTION_MOVE: {

                float deltaX = delta(dynamicX, currentX);
                float deltaY = delta(dynamicY, currentY);

                if (deltaX > deltaY) {
                    // horizontal swipe
                } else {
                    // vertical swipe
                    linearLayout.scrollBy(0, sign(dynamicY, currentY) * Math.round(deltaY));
                    return super.dispatchTouchEvent(touchevent);
                }

                dynamicX = currentX;
                dynamicY = currentY;

//                return super.dispatchTouchEvent(touchevent);
            }
        }
        return false;
//        return super.dispatchTouchEvent(touchevent);
    }

    private void swipePages(float currentX) {
        // Handling left to right screen swap.
        if (lastX < currentX) {
            // If there aren't any other children, just break.
            if (viewFlipper.getDisplayedChild() == 0)
                return;
            // Next screen comes in from left.
            viewFlipper.setInAnimation(this, R.anim.slide_in_from_left);
            // Current screen goes out from right.
            viewFlipper.setOutAnimation(this, R.anim.slide_out_to_right);
            // Display next screen.
            viewFlipper.showNext();
        }
        // Handling right to left screen swap.
        if (lastX > currentX) {
            // If there is a child (to the left), kust break.
            if (viewFlipper.getDisplayedChild() == 1)
                return;
            // Next screen comes in from right.
            viewFlipper.setInAnimation(this, R.anim.slide_in_from_right);
            // Current screen goes out from left.
            viewFlipper.setOutAnimation(this, R.anim.slide_out_to_left);
            // Display previous screen.
            viewFlipper.showPrevious();
        }
    }

    public int sign(float last, float current) {
        return last < current ? -1 : +1;
    }

    public float delta(float last, float current) {
        return last < current ? current - last : last - current;
    }
}
