package com.example.kylinarm.searchviewdemo.components.view.seach;

import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

/**
 * Created by kylin on 2018/2/23.
 */

public interface SearchExtendImpl {

    int getLayoutId();

    ImageView getImageView();

    EditText getEditText();

    ViewGroup getSearchFrame();

    void initChildView();

}
