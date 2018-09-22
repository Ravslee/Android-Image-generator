package com.sparkleidea.imagegeneratordemo;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.sparkleidea.androidimagegenerator.ImageGenerator;
import com.sparkleidea.androidimagegenerator.TextDrawable;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editText = findViewById(R.id.editText);

        Button button = findViewById(R.id.btn_submit);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = findViewById(R.id.image_view);

                TextDrawable textDrawable = TextDrawable.builder().buildRect(editText.getText().toString(), Color.MAGENTA);
                imageView.setImageBitmap(ImageGenerator.getRectImage(textDrawable,1280,720));

//                Bitmap bitmap = ImageGenerator.getRectImage(textDrawable);

            }
        });

    }


}
