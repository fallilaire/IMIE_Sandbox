package sampleTpInjection;

import javax.inject.Named;

@Named("FerrariAutoService")
public class FerrariAutoService implements AutoService {

	@Override
	public void getService() {
		System.out.println("Ferrari Auto Service");
		
	}

}
