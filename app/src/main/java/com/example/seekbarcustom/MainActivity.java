package com.example.seekbarcustom;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

     private SeekBar seekBar, seekBar2;

    private TextView progressText,  progressText2;
    private CustomSeekBar customSeekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /// seek bar personalizada 1
        progressText = findViewById(R.id.progressText);
        customSeekBar = findViewById(R.id.customSeekBar);
        customSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressText.setText(progress + "ml");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // Não utilizado
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // Não utilizado
            }
        });


        /// seek bar personalizada 2
        seekBar2 = findViewById(R.id.seekBarCustom2);
        progressText2 = findViewById(R.id.progressText2);

        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressText2.setText(progress + "ml");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

    /// seek bar padrão 3
        seekBar = findViewById(R.id.seekBar);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int stepSize = 10; // Define o tamanho das divisões
                progress = (progress/stepSize) * stepSize;
                seekBar.setProgress(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });



    }
}