package com.aliouswang.swipeback.helper;

import android.app.Activity;
import android.view.LayoutInflater;

import com.aliouswang.swipeback.R;
import com.aliouswang.swipeback.widget.BaseSwipeLayout;

/**
 * Created by Administrator on 2016/2/20 0020.
 */
public class SwipeHelper {

    private Activity mActivity;
    private BaseSwipeLayout mBaseSwipeLayout;

    public SwipeHelper(Activity activity) {
        this.mActivity = activity;
    }

    public void onActivityCreate() {
        mBaseSwipeLayout = (BaseSwipeLayout) LayoutInflater.from(mActivity)
                .inflate(R.layout.swipe_layout, null);
        mBaseSwipeLayout.setmFinishScroll(new BaseSwipeLayout.OnFinishScroll() {
            @Override
            public void finish() {
                mActivity.finish();
            }
        });
    }

    public void onPostCreate() {
        mBaseSwipeLayout.attachToActivity(mActivity);
    }


}
