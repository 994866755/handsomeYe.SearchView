package com.example.kylinarm.searchviewdemo.components.view.searchson;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.example.kylinarm.searchviewdemo.R;
import com.example.kylinarm.searchviewdemo.components.view.seach.KylinSearchView;
import com.example.kylinarm.searchviewdemo.components.view.seach.SearchExtendImpl;

/**
 * Created by kylin on 2018/2/26.
 * 仿微信搜索框
 */

public class WxSearchView extends KylinSearchView{

    private RelativeLayout searchFrame;
    private EditText edtSearch;
    private ImageView ivSearch;

    public WxSearchView(Context context) {
        super(context);
    }

    public WxSearchView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    @Override
    public int getLayoutId() {
        return R.layout.layout_wx_search;
    }

    @Override
    public void initChildView() {
        searchFrame = seachView.findViewById(R.id.rl_content_wx);
        edtSearch = seachView.findViewById(R.id.edt_search_wx);
        ivSearch = seachView.findViewById(R.id.iv_search_wx);
    }

    @Override
    public ImageView getImageView() {
        return ivSearch;
    }

    @Override
    public EditText getEditText() {
        return edtSearch;
    }

    @Override
    public RelativeLayout getSearchFrame() {
        return searchFrame;
    }
}
