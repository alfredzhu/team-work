package com.example.dt;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends Activity {
private Button btn1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	requestWindowFeature(Window.FEATURE_NO_TITLE);//隐藏标题栏
    	getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN ); //隐藏状态栏
    	super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    	
        btn1 = (Button) this.findViewById(R.id.btn1);
    	btn1.setOnClickListener(new View.OnClickListener()
    	{ 
    	    @Override 
    	    public void onClick(View v)
    	    {

    	        //Intent是一种运行时绑定（run-time binding）机制，它能在程序运行过程中连接两个不同的组件。

    	        //page1为先前已添加的类，并已在AndroidManifest.xml内添加活动事件(<activity android:name="page1"></activity>),在存放资源代码的文件夹下下， 
    	        Intent i = new Intent(MainActivity.this , second.class);

    	        ////启动 
    	        startActivity(i); 
    	    } 
    	});
    	
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
