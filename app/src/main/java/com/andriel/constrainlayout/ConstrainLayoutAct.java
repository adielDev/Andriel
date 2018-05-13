package com.andriel.constrainlayout;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.andriel.BR;
import com.andriel.R;

public class ConstrainLayoutAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_constrain_layout);

       // ViewDataBinding viewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_constrain_layout);
        UiData uiData = new UiData();
      //  viewDataBinding.setVariable(BR.uiData, uiData);
    }

    public class UiData extends BaseObservable {

        public void sayHy(View view) {
            Toast.makeText(ConstrainLayoutAct.this, "sayHy", Toast.LENGTH_SHORT).show();
        }

        String content = "aaaaa";

        @Bindable
        public String getContent() {
            return content;
        }

        @Bindable
        public void setContent(String content) {
            this.content = content;
         //   notifyPropertyChanged(BR.content);
        }
    }
}
