package id.ac.polinema.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import id.ac.polinema.recyclerview.adapters.ReversedLogoAdapter;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void handleSimpleButton(View view) {
		Intent intent = new Intent(MainActivity.this,SimpleActivity.class);
		startActivity(intent);
	}

	public void handleLogoButton(View view) {
		Intent intent = new Intent(MainActivity.this,LogoActivity.class);
		startActivity(intent);
	}

	public void handleGridButton(View view) {
		Intent intent = new Intent(MainActivity.this,GridActivity.class);
		startActivity(intent);
	}

	public void handleViewTypeButton(View view) {
		Intent intent = new Intent(MainActivity.this, ViewTypeActivity.class);
		startActivity(intent);
	}

	public void handleExercise(View view) {
		Intent intent = new Intent(MainActivity.this, ExerciseActivity.class);
		startActivity(intent);
	}
}
