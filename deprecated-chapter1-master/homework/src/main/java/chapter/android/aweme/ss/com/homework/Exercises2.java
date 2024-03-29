package chapter.android.aweme.ss.com.homework;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * 作业2：一个抖音笔试题：统计页面所有view的个数
 * Tips：ViewGroup有两个API
 * {@link android.view.ViewGroup #getChildAt(int) #getChildCount()}
 * 用一个TextView展示出来
 */
public class Exercises2 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view = LayoutInflater.from(this).inflate(R.layout.activity_chatroom,null);
        setContentView(view);
        int viewcount = getViewCount(view);
        System.out.println("View count = " + viewcount);
    }

    public static int getViewCount(View view) {
        //todo 补全你的代码
        ViewGroup viewgroup = (ViewGroup) view;
        int i,len;
        int count=0;
        count+=viewgroup.getChildCount();
        len=viewgroup.getChildCount();
        for(i=0;i<len;i++){
            View view1 = viewgroup.getChildAt(i);
            if(view1 instanceof ViewGroup)
                count+=getViewCount(viewgroup.getChildAt(i));
        }
        return count;

    }

}


