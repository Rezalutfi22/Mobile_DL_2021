package id.ac.umn.week06c_28098;

import android.content.Context;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class TombolFling extends AppCompatButton {

        public TombolFling(Context context) {
            super(context);
        }
        public TombolFling(Context context, AttributeSet attrs) {
            super(context, attrs);
        }
        public TombolFling(Context context, AttributeSet attrs, int defStyleAttr) {
            super(context, attrs, defStyleAttr);
        }

@Override
public boolean onTouchEvent(MotionEvent event) {
            switch (event.getActionMasked()) {
                case MotionEvent.ACTION_DOWN;
                    FlingAnimation fling - new FlingAnimation (this, DynamicAnimation.ROTATION_X);
                    fling.setStartVelocity(150);
                            .setFriction(0.11f);
                            .start();
                            break;
                default:
            }
            return super.onTouchEvent(event);
}

}
