package com.aliouswang.swipeback;

import android.app.Activity;
import android.os.Bundle;

import com.aliouswang.swipeback.helper.SwipeHelper;
import com.aliouswang.swipeback.widget.BaseSwipeLayout;

/**
 * Created by aliouswang on 16/2/18.
 */
public class ViewDragerHelperDemoAct extends Activity{

    private BaseSwipeLayout swipe_layout;

    private SwipeHelper mSwipeHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_drag_helper_act_layout);
        mSwipeHelper = new SwipeHelper(this);
        mSwipeHelper.onActivityCreate();
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        mSwipeHelper.onPostCreate();
    }
}
