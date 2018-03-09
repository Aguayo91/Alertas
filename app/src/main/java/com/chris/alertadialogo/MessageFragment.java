package com.chris.alertadialogo;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialogFragment;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

/**
 * Created by chris on 08/03/2018.
 */

public class MessageFragment extends AppCompatDialogFragment {

        @Override
            public Dialog onCreateDialog (Bundle savedInstanceState){


                View v = LayoutInflater.from(getActivity()) .inflate(R.layout.message_layout, null);

                DialogInterface.OnClickListener listener = new DialogInterface.OnClickListener (){



           @Override
        public void onClick(DialogInterface dialog, int which){
                Log.i ("TAG", "Cambiando mensaje");

       }
    };

        return new AlertDialog.Builder(getActivity())
               .setTitle(R.string.seguro_aplicar_descuento_falta)
               .setView(v)
               .setPositiveButton(R.string.si, listener)
               .setNegativeButton(R.string.NO, listener)
               .create();





    }

 }