package mvplanermobile.timoklostermann.de.mvplanermobile;

import android.support.v4.widget.DrawerLayout;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

import java.util.ArrayList;

import mvplanermobile.timoklostermann.de.mvplanermobile.entities.DiveProfile;
import mvplanermobile.timoklostermann.de.mvplanermobile.entities.Gas;
import mvplanermobile.timoklostermann.de.mvplanermobile.views.NonScrollListView;


public class MainActivity extends BaseActivity {

    private NonScrollListView lv_main_dive_profile;
    private NonScrollListView lv_main_gas_list;
    private CheckBox cb_main_surface_interval;
    private EditText edt_main_mins;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        cb_main_surface_interval = (CheckBox) findViewById(R.id.cb_main_surface_interval);
        edt_main_mins = (EditText) findViewById(R.id.edt_main_mins);

        cb_main_surface_interval.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                edt_main_mins.setEnabled(isChecked);
                if(isChecked) {
                    edt_main_mins.requestFocus();
                }
            }
        });

        lv_main_dive_profile = (NonScrollListView) findViewById(R.id.lv_dive_profile);
        lv_main_gas_list = (NonScrollListView) findViewById(R.id.lv_gas_list);

        Gas air = new Gas("Air", 0, 21, 66, 1.6, true);
        Gas n20 = new Gas("n5", 0, 5, 310, 1.6, true);
        ArrayList<Gas> gasList = new ArrayList<Gas>();
        gasList.add(air);
        gasList.add(n20);
        gasList.add(air);
        gasList.add(air);
        gasList.add(air);
        gasList.add(air);
        gasList.add(air);
        gasList.add(air);
        gasList.add(air);
        gasList.add(air);
        gasList.add(air);
        gasList.add(air);
        gasList.add(air);
        gasList.add(air);
        gasList.add(air);
        gasList.add(air);
        gasList.add(air);
        gasList.add(air);
        gasList.add(air);
        gasList.add(air);
        gasList.add(air);
        gasList.add(air);
        gasList.add(air);
        gasList.add(air);
        gasList.add(air);
        gasList.add(air);
        ArrayAdapter<Gas> gasAdapter = new ArrayAdapter<Gas>(this, android.R.layout.simple_list_item_1, gasList);
        lv_main_gas_list.setAdapter(gasAdapter);

        ArrayList<DiveProfile> diveProfiles = new ArrayList<DiveProfile>();
        diveProfiles.add(new DiveProfile(30, 20, air, 1.3, true));
        ArrayAdapter<DiveProfile> diveProfileAdapter = new ArrayAdapter<DiveProfile>(this, android.R.layout.simple_list_item_1, diveProfiles);
        lv_main_dive_profile.setAdapter(diveProfileAdapter);
    }

    @Override protected int getLayoutResource() {
        return R.layout.activity_main;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (item.getItemId()) {
            case android.R.id.home:
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
