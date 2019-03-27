package com.example.administrator.ad;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ActionMenuView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout)
                findViewById(R.id.collapsing_toolbar);
        //声明变量
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            //图标可点击
            actionBar.setDisplayHomeAsUpEnabled(true);
            //给左上角加一个返回图标
        }
        //使用回退键
        ImageView button1 = (ImageView) findViewById(R.id.touxiang);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Oher1Activity.class);
                startActivity(intent);
            }
        });
        //添加点击头像事件（新的activity）

        Button button2 = (Button) findViewById(R.id.fensi);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Oher1Activity.class);
                startActivity(intent);
            }
        });
        //添加点击粉丝事件（新的activity）

        Button button3 = (Button) findViewById(R.id.guanzhuliang);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Oher1Activity.class);
                startActivity(intent);
            }
        });
        //添加点击关注事件（新的activity）

        final ImageButton imageButton = (ImageButton) findViewById(R.id.guanzhu);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageButton.setImageDrawable(getResources().getDrawable(R.drawable.guanzhu_huang));
                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setMessage("关注成功！");
                dialog.setCancelable(false);
            }
        });
        //图片加关注的点击事件

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        //第一个参数表示通过哪一个资源文件来创建菜单，第二个指定将菜单项添加到哪一个Menu对象中
        return true;
    }
    //复写方法，设置创建选项菜单，并得到并实例化menu布局文件，true显示菜单

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add_item:
                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("提示");
                dialog.setMessage("确定举报当前用户吗？");
                dialog.setCancelable(false);
                dialog.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                dialog.setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                dialog.show();
                break;
            default:
                break;

        }
        return true;

    }
    //复写方法，添加菜单按钮点击事件
}
