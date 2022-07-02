package edu.it.utiles;

import java.util.Random;
import java.util.UUID;

import com.github.javafaker.Faker;

import edu.it.model.TipoDeUsuario;
import edu.it.model.Usuario;

public class UsuarioUtiles {
	private static Faker fkr;
	static {
		fkr = new Faker();
	}
	public static Usuario crearUsuarioRandom() {
		Usuario usu = new Usuario();
        usu.id = UUID.randomUUID().toString();
        usu.nombre = fkr.address().firstName();
        usu.apellido = fkr.address().lastName();
        usu.domicilio = fkr.address().streetName() + " " + fkr.address().streetAddressNumber();
        usu.pais = fkr.address().country();
        usu.tipoDeUsuario = (new Random().nextInt() % 2 == 0) ?
                TipoDeUsuario.USUARIO_ESTANDAR :
                TipoDeUsuario.USUARIO_ROOT;
        
        return usu;
	}
}
