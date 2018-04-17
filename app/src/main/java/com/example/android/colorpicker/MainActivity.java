package com.example.android.colorpicker;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private RelativeLayout relativeLayout;
    private TextView alphaTextView;
    private TextView redTextView;
    private TextView greenTextView;
    private TextView blueTextView;
    int alpha;
    int red;
    int green;
    int blue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        relativeLayout = findViewById(R.id.relative_layout);

        SeekBar alphaSeekBar = findViewById(R.id.alpha_sb);
        SeekBar redSeekBar = findViewById(R.id.red_sb);
        SeekBar greenSeekBar = findViewById(R.id.green_sb);
        SeekBar blueSeekBar = findViewById(R.id.blue_sb);

        alphaTextView = findViewById(R.id.alpha_tv);
        redTextView = findViewById(R.id.red_tv);
        greenTextView = findViewById(R.id.green_tv);
        blueTextView = findViewById(R.id.blue_tv);

        alphaSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                alpha = progress;
                String progressText;
                if(progress < 10) {
                    progressText = "00" + progress;
                } else if(progress < 100) {
                    progressText = "0" + progress;
                } else {
                    progressText = "" + progress;
                }
                alphaTextView.setText(progressText);
                relativeLayout.setBackgroundColor(Color.argb(alpha, red, green, blue));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        redSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                red = progress;
                String progressText;
                if(progress < 10) {
                    progressText = "00" + progress;
                } else if(progress < 100) {
                    progressText = "0" + progress;
                } else {
                    progressText = "" + progress;
                }
                redTextView.setText(progressText);
                relativeLayout.setBackgroundColor(Color.argb(alpha, red, green, blue));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        greenSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                green = progress;
                String progressText;
                if(progress < 10) {
                    progressText = "00" + progress;
                } else if(progress < 100) {
                    progressText = "0" + progress;
                } else {
                    progressText = "" + progress;
                }
                greenTextView.setText(progressText);
                relativeLayout.setBackgroundColor(Color.argb(alpha, red, green, blue));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        blueSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                blue = progress;
                String progressText;
                if(progress < 10) {
                    progressText = "00" + progress;
                } else if(progress < 100) {
                    progressText = "0" + progress;
                } else {
                    progressText = "" + progress;
                }
                blueTextView.setText(progressText);
                relativeLayout.setBackgroundColor(Color.argb(alpha, red, green, blue));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
