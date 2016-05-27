package com.robot.dagger2test;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;

import com.test.DaggerStudentComponent;
import com.test.SchoolModule;
import com.test.Student;
import com.test1.Home;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    UserAdapter adapter;

    private ListView listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview = (ListView) findViewById(R.id.listview);

        DaggerUserComponent.builder().userModule(new UserModule(this))
                .build().inject(this);
        listview.setAdapter(adapter);
        Student student = new Student();

        /**
         * 这里会报错，报错的原因也很简单，没有调用相关的inject，将student对象传入进去。
         DaggerStudentComponent.builder().schoolModule(new SchoolModule()).build();
         student.doWork();
         */

        DaggerStudentComponent.builder().schoolModule(new SchoolModule()).build().inject(student);
        student.doWork();

        Home home = new Home();
        home.doSomething();
    }

}
