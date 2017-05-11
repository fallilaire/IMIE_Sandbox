package sampleTpInjection;

import javax.inject.Named;

@Named("OpelAutoService")
public class OpelAutoService implements AutoService {

	@Override
	public void getService() {
		System.out.println("Opel Auto Service");
		
	}

}
