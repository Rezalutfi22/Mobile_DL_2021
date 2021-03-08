package id.ac.umn.week06c_28098;

import android.content.Context;
import android.text.style.DynamicDrawableSpan;
import android.util.AttributeSet;
import android.util.FloatProperty;
import android.view.MotionEvent;

public class TombolSpring extends AppCombatButton {

    public TombolSpring(Context context) {
        super(context);
    }
    public TombolSpring(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    public TombolSpring(Context context, AttributeSet attra, int defStyleAttr) {
        super(context, attra, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getActionMasked()) {
            case MotionEvent.ACTION_DOWN;
                final SpringAnimation anim = new SpringAnimation (this, (FloatPropertyCombat) DynamicAnimation.Y, this.getY());
                anim.setStartVelocity(10000);
                anim.getSpring(),setStiffness(STIFFNESS_LOW);
                anim.start();
                break;
                default:
        }
        return super.onTouchEvent(event);
    }
}
