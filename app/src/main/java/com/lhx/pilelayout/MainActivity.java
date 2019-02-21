package com.lhx.pilelayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PileLayout pileLayout = findViewById(R.id.pile_layout);
        List<String> urlList = new ArrayList<>();

        urlList.add("http://tb.himg.baidu.com/sys/portrait/item/d855e69bbce69bbce788b1e99ba8e724");
        urlList.add("http://tb.himg.baidu.com/sys/portrait/item/7068736f756c666366634d2c");
        urlList.add("http://tb.himg.baidu.com/sys/portrait/item/fa78e4bc9ae88083e694afe68fb4e4b8b6e9a699e78b97db3d");
        urlList.add("http://tb.himg.baidu.com/sys/portrait/item/07c44c6f7665797169616e67372941");
        urlList.add("http://img0.imgtn.bdimg.com/it/u=2263418180,3668836868&fm=206&gp=0.jpg");
        urlList.add("http://tb.himg.baidu.com/sys/portrait/item/19e3e5b9b3e4b89c630d2c");
        urlList.add("http://tb.himg.baidu.com/sys/portrait/item/982be893a6e784b6e5aea2a334");
        urlList.add("http://tb.himg.baidu.com/sys/portrait/item/1fcfe78bace788b15f305307");
        urlList.add("http://tb.himg.baidu.com/sys/portrait/item/3ca36e38e79086e699bae593a5a63f");
        urlList.add("http://tb.himg.baidu.com/sys/portrait/item/2c6068616e64736f6d654e415255544f3d5d");
        urlList.add("http://tb.himg.baidu.com/sys/portrait/item/bf186b6169736531323138ef7b");
        urlList.add("http://tb.himg.baidu.com/sys/portrait/item/9b06e5b0bce5a791e7949fe4b8aae5b08fe5928ce5b09a901a");
        urlList.add("http://tb.himg.baidu.com/sys/portrait/item/cc9fe695b4e5a4a9e69995e5a4b4e8bdace59091313939");
        urlList.add("http://tb.himg.baidu.com/sys/portrait/item/8d0ce5819ae887aae5b7b1e5b0b1e5a5bd3434b62f");
        urlList.add("http://tb.himg.baidu.com/sys/portrait/item/1589e7979be59ca8e79086e683b3e99da2e5898df30c");

        pileLayout.setRightToLeft(true);
        pileLayout.setUrls(urlList);
    }
}
