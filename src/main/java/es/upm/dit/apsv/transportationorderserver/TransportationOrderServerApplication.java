package es.upm.dit.apsv.transportationorderserver;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import es.upm.dit.apsv.transportationorderserver.repository.TransportationOrderRepository;

@SpringBootApplication

public class TransportationOrderServerApplication {

	private TransportationOrderRepository torderRepository;

	public static void main(String[] args) {

		SpringApplication.run(TransportationOrderServerApplication.class, args);

	}

}
