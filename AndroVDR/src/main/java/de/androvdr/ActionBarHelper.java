package de.androvdr;

import android.app.Activity;
import android.support.v4.app.FragmentActivity;

public class ActionBarHelper {

	public static CompatActionBar getActionBar(FragmentActivity activity) {
			return new CompatActionBar();
	}

	public static void setHomeButtonEnabled(Activity activity, boolean enabled) {
			CompatActionBar.setHomeButtonEnabled(activity, enabled);
	}
}
