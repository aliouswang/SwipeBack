package com.aliouswang.swipeback;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.widget.ViewDragHelper;

import com.aliouswang.swipeback.widget.BaseSwipeLayout;

/**
 * Created by aliouswang on 16/2/18.
 */
public class ViewDragerHelperDemoAct extends Activity{

    private BaseSwipeLayout swipe_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_drag_helper_act_layout);
        swipe_layout = (BaseSwipeLayout) findViewById(R.id.swipe_layout);
        swipe_layout.setmFinishScroll(new BaseSwipeLayout.OnFinishScroll() {
            @Override
            public void finish() {
                ViewDragerHelperDemoAct.this.finish();
            }
        });
        swipe_layout.setSwipeEdge(ViewDragHelper.EDGE_RIGHT);
    }
}
