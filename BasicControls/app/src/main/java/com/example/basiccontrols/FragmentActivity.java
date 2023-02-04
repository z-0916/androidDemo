package com.example.basiccontrols;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.basiccontrols.customcontrols.ItemView;
import com.example.basiccontrols.customcontrols.ScrollChangeView;

public class FragmentActivity extends AppCompatActivity implements  RadioGroup.OnCheckedChangeListener {
    private RadioGroup rg_tab_bar;
    private RadioButton rb_home;
    private MyFragment myFragment;
    private MessageFragment messageFragment;
    private HomeFragment homeFragment;
    private FragmentManager fm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        /*android包*/
        fm = getFragmentManager();
        rg_tab_bar = findViewById(R.id.rg_tab_bar);
        rg_tab_bar.setOnCheckedChangeListener(this);
//        获取第一个单选按钮，并设置为选中状态
        rb_home = findViewById(R.id.rb_home);
        rb_home.setChecked(true);
 }


    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        hideAllFragment(fragmentTransaction);
        switch (i) {
            case R.id.rb_home:
                if (homeFragment == null) {
                    homeFragment = new HomeFragment();
                    fragmentTransaction.add(R.id.ly_content, homeFragment);
                } else {
                    fragmentTransaction.show(homeFragment);
                }
                break;
            case R.id.rb_message:
                if (messageFragment == null) {
                    messageFragment = new MessageFragment();
                    fragmentTransaction.add(R.id.ly_content, messageFragment);
                } else {
                    fragmentTransaction.show(messageFragment);
                }
                break;
            case R.id.rb_my:
                if (myFragment == null) {
                    myFragment = new MyFragment();
                    fragmentTransaction.add(R.id.ly_content, myFragment);
                } else {
                    fragmentTransaction.show(myFragment);
                }
                break;
        }
        fragmentTransaction.commit();
    }

    /*
    隐藏所有fragment
     */
    private void hideAllFragment(FragmentTransaction fragmentTransaction) {
        if (homeFragment != null) fragmentTransaction.hide(homeFragment);
        if (messageFragment != null) fragmentTransaction.hide(messageFragment);
        if (myFragment != null) fragmentTransaction.hide(myFragment);
    }

}
