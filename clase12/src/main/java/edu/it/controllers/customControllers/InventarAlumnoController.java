package edu.it.controllers.customControllers;

import java.util.Map;

import edu.it.basededatos.UtilesAlumno;

public class InventarAlumnoController implements RestApiController {
	@Override
	public Object onDoGetParams(Map<String, String> mapaDeParams) {
		return UtilesAlumno.generarAlumnoRandom();
	}

	@Override
	public Object onDoGetPorId(String id) {
		throw new edu.it.errores.BadRequestException("");
	}

	@Override
	public Object onDoPost(String json) {
		throw new edu.it.errores.BadRequestException("");
	}

	@Override
	public void onDoPut(String id, String json) {
		throw new edu.it.errores.BadRequestException("");
	}

	public void onDelete(String id) {
		throw new edu.it.errores.BadRequestException("");
	}
	
}
