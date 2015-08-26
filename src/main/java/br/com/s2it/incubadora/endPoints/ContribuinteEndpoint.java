package br.com.s2it.incubadora.endPoints;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.s2it.incubadora.model.Contribuinte;
import br.com.s2it.incubadora.service.ContribuinteService;

@RestController
@RequestMapping("/end/contrib")
public class ContribuinteEndpoint {

	@Autowired
	private ContribuinteService service;

	@RequestMapping(value = "", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> save(@RequestBody Contribuinte contribuinte) {
		service.save(contribuinte);
		return new ResponseEntity<Contribuinte>(HttpStatus.OK);
	}

	@RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> listAll() {
		return new ResponseEntity<List<Contribuinte>>(service.listAll(), HttpStatus.OK);
	}

	@RequestMapping(value = "", method = RequestMethod.PATCH, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> update(@RequestBody Contribuinte contribuinte) {
		service.update(contribuinte);

		return new ResponseEntity<Contribuinte>(HttpStatus.OK);
	}

	@RequestMapping(value = "/{cod}", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> delete(int cod) {
		service.delete(new Contribuinte(cod));
		return new ResponseEntity<Contribuinte>(HttpStatus.OK);
	}

}
