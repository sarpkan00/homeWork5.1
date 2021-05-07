package homeWork5.core;

import homeWork5.GoogleL.GoogleManager;

public class GoogleAdapter implements IGoogleService {

	@Override
	public void registerToSystem(String message) {
		GoogleManager manager = new GoogleManager();
		manager.registerWithGoogle(message);
	}

}
