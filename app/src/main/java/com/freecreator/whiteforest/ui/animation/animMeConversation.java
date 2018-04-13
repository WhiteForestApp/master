package com.freecreator.whiteforest.ui.animation;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.freecreator.whiteforest.R;
import com.freecreator.whiteforest.ui.utils.AdjustSize;
import com.freecreator.whiteforest.ui.utils.Size;

/**
 * Created by niko on 2018/4/13.
 */

public class animMeConversation {


    private AppCompatActivity m_parent = null;
    private RelativeLayout mDialog = null;
    private ImageView image_player = null;



    public animMeConversation(AppCompatActivity parent, RelativeLayout attachment){
        m_parent = parent;

        mDialog = (RelativeLayout)m_parent.getLayoutInflater().inflate(R.layout.anim_me_conversation, null);

        Size refSize = AdjustSize.getImageWidthHeight(m_parent, R.drawable.role_in_story);
        Size bgSize = AdjustSize.getScreenSize(m_parent);
        bgSize.width = (int)(bgSize.width * 0.5);
        float h  = (float)bgSize.width * (float)refSize.height / (float)refSize.width;

        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(bgSize.width, (int)h);
        params.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        params.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        params.setMargins(0,0,0,-600);

        UI_init();
        attachment.addView(mDialog, params);

        mDialog.setVisibility(View.INVISIBLE);
    }

    private void UI_init() {
        image_player = (ImageView)mDialog.findViewById(R.id.image_player);
    }

    public void show(){
        mDialog.setVisibility(View.VISIBLE);
        mDialog.requestFocus();

        ObjectAnimator animator = ObjectAnimator.ofFloat(mDialog,"translationY",-550.0f);
        animator.setDuration(500);
        animator.start();
    }

    public void hide(){
        ObjectAnimator animator = ObjectAnimator.ofFloat(mDialog,"translationY",450.0f);
        animator.setDuration(500);
        animator.start();
    }
}
