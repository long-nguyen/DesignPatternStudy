package Meditator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Welcome {

	Mediator meditator;
	String response = "n";

	public Welcome(Mediator m) {
		meditator = m;
	}

	public void go() {
		System.out.print("Do you want to shop? [y/n]? ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			response = reader.readLine();
		} catch (IOException e) {
			System.err.println("Error");
		}
		if (response.equals("y")) {
			meditator.handle("welcome.shop");
		} else {
			meditator.handle("welcome.exit");
		}
	}
}
