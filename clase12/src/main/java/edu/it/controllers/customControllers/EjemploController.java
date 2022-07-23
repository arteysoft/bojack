package edu.it.controllers.customControllers;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.log4j.Logger;

import com.google.gson.Gson;
import edu.it.dto.UsuarioDTO;

public class EjemploController implements RestApiController {
	private Logger logger = Logger.getLogger(getClass());
	
	public Object onDoGetParams(Map<String, String> mapaDeParams) {
		mapaDeParams.put("ultimo", "hola");
		return mapaDeParams;
	}
	public Object onDoGetPorId(String id) {
		Map<String, String> mapaDeParams = new HashMap<String, String>();
		mapaDeParams.put("PorID", "true");
		return mapaDeParams;
	}
	public Object onDoPost(String json) {
		Map<String, String> mapaDeParams = new HashMap<String, String>();
		mapaDeParams.put("accion", "llegaUnDoPost");
		return mapaDeParams;
	}
	public void onDoPut(String id, String json) {
		logger.info("Hasta aca llego, voy a tirar un Exception");
		throw new edu.it.errores.BadRequestException("No esta implementado el put aun");
	}
	public void onDelete(String id) {
		logger.info("Llega un delete con id: " + id);
	}
}
