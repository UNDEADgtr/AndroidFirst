package by.undead.firstandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button btnLogin = (Button)findViewById(R.id.btnLogin);
        Button btnClean = (Button)findViewById(R.id.btnClean);
        
        final TextView txtLofin = (TextView)findViewById(R.id.txtLogin);
        final TextView txtPassword = (TextView)findViewById(R.id.txtPassword);
        final TextView txtResult = (TextView)findViewById(R.id.txtResult);
        
        btnLogin.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				txtResult.setText(txtPassword.getText());	
			}
		});
        
        btnClean.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				txtLofin.setText("");
				txtPassword.setText("");
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
