package com.example.f390.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class HelloWorld extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);
        TextView v = findViewById(R.id.text);
        v.setText("blah");
        v.setTextColor(0x666666);

        Toast a = Toast.makeText(this,"Hello",Toast.LENGTH_LONG);
        a.show();
    }
}
//class animals {
//    int height;
//    static int abc;
//    int weight;
//
//    void die() {}
//    void eat() {}
//    boolean isDead() {
//        if(weight>10)
//            return true;
//        else
//            return false;
//    }
//}
//
//class rodents extends animals{
//    @Override
//    void eat()
//    {
//
//    }
//
//}
//
//class mouse extends  rodents {
//    @Override
//    void die() { return;}
//    mouse(int h,int w){
//        h= height;
//        w = weight;
//    }
//    static mouse getInstance(int h, int w) {
//        return  new mouse(h,w);
//    }
//}