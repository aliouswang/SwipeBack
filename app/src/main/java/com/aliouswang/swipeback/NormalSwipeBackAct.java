package com.aliouswang.swipeback;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.widget.ViewDragHelper;

import com.aliouswang.swipeback.widget.BaseSwipeLayout;

/**
 * Created by aliouswang on 16/2/23.
 */
public class NormalSwipeBackAct extends Activity{

    private BaseSwipeLayout swipe_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.normal_swipe_back_layout);

        swipe_layout = (BaseSwipeLayout) findViewById(R.id.swipe_layout);
        swipe_layout.setSwipeEdge(ViewDragHelper.EDGE_ALL);
        swipe_layout.setOnFinishScroll(new BaseSwipeLayout.OnFinishScroll() {
            @Override
            public void complete() {
                finish();
            }
        });
    }
}
