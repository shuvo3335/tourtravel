package com.example.shuvo.tourtravel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class feedback extends AppCompatActivity {
    private EditText msg_text;
    private TextView mymail;
    private Button send_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        msg_text = findViewById(R.id.message);
        mymail = findViewById(R.id.mail);
        send_btn = findViewById(R.id.btn_send);

        send_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String my_mail = mymail.getText().toString();
                String[] devide_mail = my_mail.split(",");
                String mail_msg = msg_text.getText().toString();


                Intent send = new Intent(Intent.ACTION_SEND);

                send.putExtra(Intent.EXTRA_EMAIL,devide_mail);

                send.putExtra(Intent.EXTRA_TEXT,mail_msg);
                //rfc822 is the expression to open emails client
                send.setType("message/rfc822");
                send.setPackage("com.google.android.gm");
                startActivity(send);
                //mymail.setEnabled(false);
            }
        });
    }
}
