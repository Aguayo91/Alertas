package com.chris.alertadialogo;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialogFragment;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            setupSetMessage();
        }

        private void setupSetMessage() {

            ImageView view = (ImageView) findViewById (R.id.ivGSLogo);
            view.setOnClickListener (new View.OnClickListener () {

                @Override
                public void onClick(View v) {

                    FragmentManager manager = getSupportFragmentManager();
                    MessageFragment dialog = new MessageFragment();
                    dialog.show(manager, "MessageDialog");


                }

            });
         }

}

