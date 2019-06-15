package senac.meuyoutube;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.RadioButton;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                RadioButton culinaria = findViewById(R.id.rbculinaria);
                RadioButton animais = findViewById(R.id.rbanimais);
                RadioButton tecnologia = findViewById(R.id.rbtecnologia);
                RadioButton beleza = findViewById(R.id.rbbeleza);
                RadioButton esporte = findViewById(R.id.rbesporte);
                WebView youtube = findViewById(R.id.webyoutube);
                String videoID = "";

                if (culinaria.isChecked()){
                    videoID = "jdNqD8QxW3s";

                }
                else if (animais.isChecked()){
                    videoID = "e3horrHdRb4";
                }
                else if (tecnologia.isChecked()){
                    videoID = "OP8tKvBhVq8";
                }
                else if (beleza.isChecked()){
                    videoID = "6ZKDKs2VHho";

                }
                else {
                    videoID = "W2f1cKL13xc";
                }

                youtube.getSettings().setJavaScriptEnabled(true);
                youtube.getSettings().setPluginState(WebSettings.PluginState.ON);
                youtube.loadUrl("http://www.youtube.com/embed/" + videoID + "?autoplay=1&vq=small");
                youtube.setWebChromeClient(new WebChromeClient());


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
