package br.edu.ifsuldeminas.mch.constraintlayout;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnBlogPost = findViewById(R.id.btnBlogPost);
        Button btnSerie    = findViewById(R.id.btnSerie);
        Button btnConcurso = findViewById(R.id.btnConcurso);

        btnBlogPost.setOnClickListener(v ->
                startActivity(new Intent(this, BlogPostActivity.class)));

        btnSerie.setOnClickListener(v ->
                startActivity(new Intent(this, SerieActivity.class)));

        btnConcurso.setOnClickListener(v ->
                startActivity(new Intent(this, ConcursoActivity.class)));
    }
}
