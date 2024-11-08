package com.Delayer.DelayService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DelayController {

	@GetMapping("/delay/{seconds}")
	public int delay(@PathVariable("seconds") int seconds) {
		System.out.println("Recieved request to delay for: " + seconds);
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
		return seconds;
	}

}
