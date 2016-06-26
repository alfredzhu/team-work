package com.example.dt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class second extends Activity {
	private Button button1;
	private Button button2;
	private Button button3;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);//隐藏标题栏
    	getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN ); //隐藏状态栏
		
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        
        button1 = (Button) this.findViewById(R.id.button1);
    	button1.setOnClickListener(new View.OnClickListener()
    	{ 
    	    @Override 
    	    public void onClick(View v)
    	    {

    	        //Intent是一种运行时绑定（run-time binding）机制，它能在程序运行过程中连接两个不同的组件。

    	        //page1为先前已添加的类，并已在AndroidManifest.xml内添加活动事件(<activity android:name="page1"></activity>),在存放资源代码的文件夹下下， 
    	        Intent i = new Intent(second.this , runjava.class);

    	        ////启动 
    	        startActivity(i); 
    	    } 
    	});
    	
    	button2 = (Button) this.findViewById(R.id.button2);
    	button2.setOnClickListener(new View.OnClickListener()
    	{ 
    	    @Override 
    	    public void onClick(View v)
    	    {

    	        //Intent是一种运行时绑定（run-time binding）机制，它能在程序运行过程中连接两个不同的组件。

    	        //page1为先前已添加的类，并已在AndroidManifest.xml内添加活动事件(<activity android:name="page1"></activity>),在存放资源代码的文件夹下下， 
    	        Intent i = new Intent(second.this , runjava2.class);

    	        ////启动 
    	        startActivity(i); 
    	    } 
    	});
    	
    	button3 = (Button) this.findViewById(R.id.button3);
    	button3.setOnClickListener(new View.OnClickListener()
    	{ 
    	    @Override 
    	    public void onClick(View v)
    	    {

    	        //Intent是一种运行时绑定（run-time binding）机制，它能在程序运行过程中连接两个不同的组件。

    	        //page1为先前已添加的类，并已在AndroidManifest.xml内添加活动事件(<activity android:name="page1"></activity>),在存放资源代码的文件夹下下， 
    	        Intent i = new Intent(second.this , runjava3.class);

    	        ////启动 
    	        startActivity(i); 
    	    } 
    	});
    	
    	
    	
        

	}
}