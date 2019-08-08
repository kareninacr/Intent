package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button explicitintent;
    Button implicitintent;
    Button linear;
    Button relative;
    Button table;
    Button frame;
    Button constraint;
    Button grid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        explicitintent = (Button) findViewById(R.id.explicitIntent);
        explicitintent.setOnClickListener(this);

        implicitintent = (Button) findViewById(R.id.implicitIntent);
        implicitintent.setOnClickListener(this);

        linear = (Button) findViewById(R.id.linear);
        linear.setOnClickListener(this);

        relative = (Button) findViewById(R.id.relative);
        relative.setOnClickListener(this);

        table = (Button) findViewById(R.id.table);
        table.setOnClickListener(this);

        frame = (Button) findViewById(R.id.frame);
        frame.setOnClickListener(this);

        constraint = (Button) findViewById(R.id.constraint);
        constraint.setOnClickListener(this);

        grid = (Button) findViewById(R.id.grid);
        grid.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.explicitIntent:
                Intent explicit = new Intent(MainActivity.this, IntentActivity.class);
                startActivity(explicit);
                break;
            case R.id.implicitIntent:
                Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("http//www.w3school.com"));
                startActivity(implicit);
                break;
            case R.id.linear:
                Intent linear = new Intent(MainActivity.this, LinearActivity.class);
                startActivity(linear);
                break;
            case R.id.relative:
                Intent relative = new Intent(MainActivity.this, RelativeActivity.class);
                startActivity(relative);
                break;
            case R.id.table:
                Intent table = new Intent(MainActivity.this, TableActivity.class);
                startActivity(table);
                break;
            case R.id.frame:
                Intent frame = new Intent(MainActivity.this, FrameActivity.class);
                startActivity(frame);
                break;
            case R.id.constraint:
                Intent constraint = new Intent(MainActivity.this, ConstraintActivity.class);
                startActivity(constraint);
                break;
            case R.id.grid:
                Intent grid = new Intent(MainActivity.this, GridActivity.class);
                startActivity(grid);
                break;
            default:
                break;
        }
    }

    private void startActivity(Button constraint) {
    }
}
