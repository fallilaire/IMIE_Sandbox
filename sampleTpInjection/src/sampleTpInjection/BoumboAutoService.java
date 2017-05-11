package sampleTpInjection;

import javax.inject.Named;

@Named("BoumboAutoService")
public class BoumboAutoService implements AutoService {

	@Override
	public void getService() {
		System.out.println("Boumbo Auto Service");
		
	}

}
