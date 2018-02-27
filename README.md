# 搜索框控件

### 一.默认效果
![默认效果](http://upload-images.jianshu.io/upload_images/3537898-f350606a19941da0.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

该控件可通过继承的方式来实现样式上的扩展。

### 二.使用方法

##### 创建布局

```
    <com.example.kylinarm.searchviewdemo.components.view.seach.KylinSearchView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:padding="10dp"
        android:id="@+id/sv_default"
        >
    </com.example.kylinarm.searchviewdemo.components.view.seach.KylinSearchView>
```

##### 自定义属性

```
<!-- 搜索框 -->
    <declare-styleable name="kylin_search_style">
        <attr name="img_src" format="reference"/><!-- 图片地址 -->
        <attr name="img_size" format="dimension"/><!-- 图片大小 -->
        <attr name="img_visibility" format="boolean"/><!-- 图片显示/隐藏 -->
        <attr name="show_location" format="enum">
            <enum name="left" value="0"/>
            <enum name="right" value="2"/>
            <enum name="centre" value="1"/>
        </attr>
        <attr name="edt_hint" format="string"/><!-- 提示文字 -->
        <attr name="edt_size" format="dimension"/><!-- 提示文字大小 -->
        <attr name="edt_hint_color" format="color"/><!-- 提示文字的颜色 -->
        <attr name="search_backgroup" format="reference"/><!-- 搜索框背景 -->
        <attr name="search_padding" format="reference"/><!-- 搜索框背景 -->
    </declare-styleable>
```

例如
```
    <com.example.kylinarm.searchviewdemo.components.view.seach.KylinSearchView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:padding="10dp"
        android:id="@+id/sv_default"
        app:edt_hint = "搜索"
        app:edt_hint_color = "#336688"
        >
    </com.example.kylinarm.searchviewdemo.components.view.seach.KylinSearchView>
```

##### 使用方法

```
KylinSearchView searchViewDemo = (KylinSearchView) findViewById(R.id.sv_default);
```

监听搜索（默认软键盘回车搜索）
```
searchViewDemo.setOnSearchListener(this);  //实现OnSearchListener接口
```

获取搜索框内容
```
searchViewDemo.getSearchContent();
```

清空搜索框
```
searchViewDemo.clearSearch()
```

让搜索框失去焦点
```
searchViewDemo.lostRocus();
```

执行搜索操作
```
searchViewDemo.search();
```

##### 扩展
封装时只定义了一些比较常用的方法，如果有其它需求，比如说搜索时改变图片图标或者文字颜色之类的，而组件内部并没用提供这些方法，为了考虑方便扩展，开发者可以从外部获取到搜索框、提示图标、输入框三个对象。
```
searchViewDemo.getSearchEditText(); // 返回输入框
searchViewDemo.getSearchImageView(); // 返回图标
searchViewDemo.getSearchFrameView(); // 返回搜索框
```

##### 自定义样式
可以通过继承的方式实现自定义样，比如说demo中的仿微信搜索框
```
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
```

子类要重写SearchExtendImpl接口的所有方法
getImageView() 、 getEditText() 、 getSearchFrame() 需要分别返回三个对象给父类。

### 三.代码文档

https://www.jianshu.com/p/353a87f60bb6



