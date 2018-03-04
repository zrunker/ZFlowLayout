# ZFlowLayout
流式布局，常用语标签，流式列表等

>作者：邹峰立，微博：zrunker，邮箱：zrunker@yahoo.com，微信公众号：书客创作，个人平台：[www.ibooker.cc](http://www.ibooker.cc)。

>本文选自[书客创作](http://www.ibooker.cc)平台第138篇文章。[阅读原文](http://www.ibooker.cc/article/138/detail) 。

![书客创作](http://upload-images.jianshu.io/upload_images/3480018-791fcacbaa715efe..jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

一般常见的流式布局由两种，一种是横向的个数固定，列表按照竖向进行排列。另一种是横向先排，横向排满之后再竖向排列。而本框架实现是以第二种方式进行处理。

![图片来源于网络](http://upload-images.jianshu.io/upload_images/3480018-425e53158ad85b72..jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

那么这个框架到底该如何使用呢？

#### 首先引入资源

这里提供两种方式，引入资源文件。

1、在build.gradle文件中添加以下代码：
```
allprojects {
	repositories {
		maven { url 'https://jitpack.io' }
	}
}

dependencies {
	compile 'com.github.zrunker:ZFlowLayout:v1.0'
}
```
2、在maven文件中添加以下代码：
```
<repositories>
	<repository>
		<id>jitpack.io</id>
		<url>https://jitpack.io</url>
	</repository>
</repositories>

<dependency>
	<groupId>com.github.zrunker</groupId>
	<artifactId>ZFlowLayout</artifactId>
	<version>v1.0</version>
</dependency>
```

#### 使用

使用该框架，只需要两步即可。

**一、引入布局文件**
```
<cc.ibooker.zflowlayoutlib.FlowLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:id="@+id/flowlayou"
    android:layout_width="match_parent"
    android:layout_height="match_parent" />
```
**二、动态添加子控件**
```
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FlowLayout flowLayout = findViewById(R.id.flowlayou);

        LayoutInflater inflater = LayoutInflater.from(this);
        for (int i = 0; i < 20; i++) {
            TextView textView = (TextView) inflater.inflate(R.layout.tag_textview, flowLayout, false);
            if (i == 3)
                textView.setText("Android1111" + i);
            else if (i == 6)
                textView.setText("Jave1111" + i);
            else if (i == 10)
                textView.setText("kotlin1111" + i);
            else
                textView.setText("测试" + i);
            flowLayout.addView(textView);
        }
    }
}
```
其中tag_textview为自定义子控件的布局文件，代码如下：
```
<?xml version="1.0" encoding="utf-8"?>
<TextView xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:layout_margin="5dp"
    android:background="@drawable/gridview_selector"
    android:padding="5dp" />
```
当然也可以把FlowLayout直接当做一个ViewGroup在布局文件中直接加入子控件，就不需要动态的添加子控件，如下：
```
<cc.ibooker.zflowlayoutlib.FlowLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="wrap_content">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_margin="5dp"
        android:background="@drawable/gridview_selector"
        android:padding="5dp"
        android:text="张三" />

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_margin="5dp"
        android:background="@drawable/gridview_selector"
        android:padding="5dp"
        android:text="李四张三" />

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_margin="5dp"
        android:background="@drawable/gridview_selector"
        android:padding="5dp"
        android:text="王五李四张三" />

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_margin="5dp"
        android:background="@drawable/gridview_selector"
        android:padding="5dp"
        android:text="赵六王五李四张三" />

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_margin="5dp"
        android:background="@drawable/gridview_selector"
        android:padding="5dp"
        android:text="孙七赵六王五李四张三" />

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_margin="5dp"
        android:background="@drawable/gridview_selector"
        android:padding="5dp"
        android:text="周八孙七赵六王五李四张三" />

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_margin="5dp"
        android:background="@drawable/gridview_selector"
        android:padding="5dp"
        android:text="吴九周八孙七赵六王五李四张三" />

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_margin="5dp"
        android:background="@drawable/gridview_selector"
        android:padding="5dp"
        android:text="郑十吴九周八孙七赵六王五李四张三" />

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_margin="5dp"
        android:background="@drawable/gridview_selector"
        android:padding="5dp"
        android:text="Tom" />

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_margin="5dp"
        android:background="@drawable/gridview_selector"
        android:padding="5dp"
        android:text="zrunker" />

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_margin="5dp"
        android:background="@drawable/gridview_selector"
        android:padding="5dp"
        android:text="Android" />

</cc.ibooker.zflowlayoutlib.FlowLayout>
```
最后看看效果图：

![流式布局效果图](http://upload-images.jianshu.io/upload_images/3480018-78472263c7443e01..jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/370)

[Github地址](https://github.com/zrunker/ZFlowLayout)
[阅读原文](http://www.ibooker.cc/article/138/detail)

----------
![微信公众号：书客创作](http://upload-images.jianshu.io/upload_images/3480018-d1e1a60984e32700..jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
