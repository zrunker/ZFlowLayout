# ZFlowLayout
流式布局，常用语标签，流式列表等

1、在build.gradle文件中添加以下代码：
```
allprojects {
	repositories {
		maven { url 'https://jitpack.io' }
	}
}
```
```
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
```
```
<dependency>
	<groupId>com.github.zrunker</groupId>
	<artifactId>ZFlowLayout</artifactId>
	<version>v1.0</version>
</dependency>
```
用法：

### 引入布局文件
```
<cc.ibooker.zflowlayoutlib.FlowLayout 
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:id="@+id/flowlayou"
    android:layout_width="match_parent"
    android:layout_height="match_parent" />
```

### 使用

一、自定义需要使用的布局文件。
```
<?xml version="1.0" encoding="utf-8"?>
<TextView xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:layout_margin="5dp"
    android:background="@drawable/gridview_selector"
    android:padding="5dp" />
```

二、Activity相关组件操作
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
