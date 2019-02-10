package com.example.tipcalculator.view;

import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.example.tipcalculator.R;
import com.example.tipcalculator.databinding.ActivityTipCalculatorBinding;
import com.example.tipcalculator.viewModel.CalculatorViewModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;

public class MainActivity extends AppCompatActivity {

	ActivityTipCalculatorBinding binding;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//		setContentView(R.layout.activity_tip_calculator);
		binding = DataBindingUtil.setContentView(this, R.layout.activity_tip_calculator);
		binding.setVm(new CalculatorViewModel(getApplication()));
		Toolbar toolbar = findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);


		FloatingActionButton fab = findViewById(R.id.fab);
		fab.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
								.setAction("Action", null).show();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();

		//noinspection SimplifiableIfStatement
		if (id == R.id.action_settings) {
			return true;
		}

		return super.onOptionsItemSelected(item);
	}
}
