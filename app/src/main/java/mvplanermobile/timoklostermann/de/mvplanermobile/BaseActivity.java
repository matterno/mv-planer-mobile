package mvplanermobile.timoklostermann.de.mvplanermobile;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;

public abstract class BaseActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResource());

        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    protected abstract int getLayoutResource();
}