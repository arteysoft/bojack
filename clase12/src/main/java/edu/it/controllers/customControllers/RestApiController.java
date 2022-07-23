package edu.it.controllers.customControllers;

import java.util.Map;

public interface RestApiController {
	public Object onDoGetParams(Map<String, String> mapaDeParams);
	public Object onDoGetPorId(String id);
	public Object onDoPost(String json);
	public void onDoPut(String id, String json);
	public void onDelete(String id);
}
