package de.androvdr.devices;

import java.util.ArrayList;

public interface ISensor extends IDevice {

	ArrayList<String> getSensors();
	String read(String command);

}
