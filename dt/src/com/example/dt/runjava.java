package com.example.dt;



import java.text.DecimalFormat;
import java.util.Random;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class runjava extends Activity {
	public static String s[] = new String[5];//题目个数。。。5个
	private TextView questionTextView;
	private TextView trueorwrong;
	private Button answer[]=new Button[3];
	static DecimalFormat decimal = new DecimalFormat();
	static String[] staticanser = new String[10];// 标准答案
	
	String[] wrong1 = new String[10];
	String[] wrong2 = new String[10];
	int num;
	int n;
	char[] op = { '+', '-', '*', '÷' };
	Random r = new Random();
    int index; 
	int[] no = new int[4];
	 int a;
     int b;
     int count=0;
	String str = new String();
	@Override
    public void onCreate(Bundle savedInstanceState) {
		
		{	requestWindowFeature(Window.FEATURE_NO_TITLE);//隐藏标题栏
    	getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN ); //隐藏状态栏	
        super.onCreate(savedInstanceState);
        setContentView(R.layout.run);
        questionTextView=(TextView)this.findViewById(R.id.Labe4);
        answer[0]=(Button)this.findViewById(R.id.bttn1);
        answer[1]=(Button)this.findViewById(R.id.bttn2);
        answer[2]=(Button)this.findViewById(R.id.bttn3);
        trueorwrong=(TextView)this.findViewById(R.id.Labe2);
        a=(int)(1+Math.random()*(10-1+1));
		b=(int)(1+Math.random()*(10-1+1));	
		index = r.nextInt(op.length);	
		str =  String.valueOf(op[index]);
		s[count] = a+str+b+"=?";
		switch (op[index]) {
		case '+':
			num=a+b;
			break;
		case '-':
			num=a-b;
			break;
		case '*':
			num=a*b;
			break;
		case '÷':
			num=a/b;
			break;
		}
		staticanser[count]= String.valueOf(decimal.format(num));
		wrong1[count]=String.valueOf(decimal.format(num+(int)(1+Math.random()*(10-1+1))));
		wrong2[count]=String.valueOf(decimal.format(num+(int)(1+Math.random()*(10-1+1))));
		questionTextView.setText(s[count]);
		
		answer[0].setText(""+staticanser[count]+"");
		answer[1].setText(""+wrong1[count]+"");
		answer[2].setText(""+wrong2[count]+"");
		answer[0].setOnClickListener(new OnClickListener() {   	
			@Override
			public void onClick(View arg0) {
				if(count<6){
				if(answer[0].getText().equals(staticanser[count]))
				{
					trueorwrong.setText("答对啦");			
				}
				else {
					trueorwrong.setText("答错啦");
				}
				count++;
				 a=(int)(1+Math.random()*(10-1+1));
					b=(int)(1+Math.random()*(10-1+1));	
					index = r.nextInt(op.length);	
					str =  String.valueOf(op[index]);
					s[count] = a+str+b+"=?";
					switch (op[index]) {
					case '+':
						num=a+b;
						break;
					case '-':
						num=a-b;
						break;
					case '*':
						num=a*b;
						break;
					case '÷':
						num=a/b;
						break;
					}
					staticanser[count]= String.valueOf(decimal.format(num));
					wrong1[count]=String.valueOf(decimal.format(num+(int)(1+Math.random()*(10-1+1))));
					wrong2[count]=String.valueOf(decimal.format(num+(int)(1+Math.random()*(10-1+1))));
					questionTextView.setText(s[count]);
					answer[0].setText(""+staticanser[count]+"");
					answer[1].setText(""+wrong1[count]+"");
					answer[2].setText(""+wrong2[count]+"");
					
			}  			
		}});
		answer[1].setOnClickListener(new OnClickListener() {   	
			@Override
			public void onClick(View arg0) {
				if(count<6){
				if(answer[1].getText().equals(staticanser[count]))
				{
					trueorwrong.setText("答对啦");			
				}
				else {
					trueorwrong.setText("答错啦");
				}
				count++;
				 a=(int)(1+Math.random()*(10-1+1));
					b=(int)(1+Math.random()*(10-1+1));	
					index = r.nextInt(op.length);	
					str =  String.valueOf(op[index]);
					s[count] = a+str+b+"=?";
					switch (op[index]) {
					case '+':
						num=a+b;
						break;
					case '-':
						num=a-b;
						break;
					case '*':
						num=a*b;
						break;
					case '÷':
						num=a/b;
						break;
					}
					staticanser[count]= String.valueOf(decimal.format(num));
					wrong1[count]=String.valueOf(decimal.format(num+(int)(1+Math.random()*(10-1+1))));
					wrong2[count]=String.valueOf(decimal.format(num+(int)(1+Math.random()*(10-1+1))));
					questionTextView.setText(s[count]);
					answer[0].setText(""+staticanser[count]+"");
					answer[1].setText(""+wrong1[count]+"");
					answer[2].setText(""+wrong2[count]+"");
			}  			
		}});
		answer[2].setOnClickListener(new OnClickListener() {   	
			@Override
			public void onClick(View arg0) {
				if(count<6){
				if(answer[2].getText().equals(staticanser[count]))
				{
					trueorwrong.setText("答对啦");			
				}
				else {
					trueorwrong.setText("答错啦");
				}
				count++;
				 a=(int)(1+Math.random()*(10-1+1));
					b=(int)(1+Math.random()*(10-1+1));	
					index = r.nextInt(op.length);	
					str =  String.valueOf(op[index]);
					s[count] = a+str+b+"=?";
					switch (op[index]) {
					case '+':
						num=a+b;
						break;
					case '-':
						num=a-b;
						break;
					case '*':
						num=a*b;
						break;
					case '÷':
						num=a/b;
						break;
					}
					staticanser[count]= String.valueOf(decimal.format(num));
					wrong1[count]=String.valueOf(decimal.format(num+(int)(1+Math.random()*(10-1+1))));
					wrong2[count]=String.valueOf(decimal.format(num+(int)(1+Math.random()*(10-1+1))));
					questionTextView.setText(s[count]);
					answer[0].setText(""+staticanser[count]+"");
					answer[1].setText(""+wrong1[count]+"");
					answer[2].setText(""+wrong2[count]+"");
			}  			
		}});
    }

	}	
}
    
