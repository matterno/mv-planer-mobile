package mvplanermobile.timoklostermann.de.mvplanermobile.adapters;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.List;

import mvplanermobile.timoklostermann.de.mvplanermobile.entities.DiveProfile;

/**
 * Created by Timo on 07.01.2015.
 */
public class DiveProfileArrayAdapter extends ArrayAdapter<DiveProfile> {


    public DiveProfileArrayAdapter(Context context, int resource, int textViewResourceId, List<DiveProfile> objects) {
        super(context, resource, textViewResourceId, objects);
    }
}
