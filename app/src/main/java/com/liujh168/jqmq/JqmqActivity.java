package com.liujh168.jqmq;

import static android.content.ContentValues.TAG;
import static com.liujh168.jqmq.ViewConstant.*;

import java.util.HashMap;
import android.app.Activity;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Window;
import android.view.WindowManager;

public class JqmqActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
      
	  //����ȫ����ʾ
        requestWindowFeature(Window.FEATURE_NO_TITLE); 
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
      
	  //���ú���ģʽ
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

		Log.d("JqmqActivity", "onCreate: �����ӡ������Ϣ��");
		

    }
}