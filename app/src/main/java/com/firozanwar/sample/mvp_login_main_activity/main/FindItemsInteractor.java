package com.firozanwar.sample.mvp_login_main_activity.main;

import java.util.List;

/**
 * Created by firozanwar on 17/10/17.
 */

public interface FindItemsInteractor {

    interface OnFinishedListener {
        void onFinished(List<String> items);
    }

    void findItems(OnFinishedListener listener);
}
