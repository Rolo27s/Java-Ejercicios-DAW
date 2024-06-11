package Ejercicio2;

import java.util.List;

public class Test_Ej2 {

	public static void main(String[] args) {
		UsuarioDAO userDAO = new UsuarioDAO();
		//COMPLETAR
		List<Usuario> lista = userDAO.cargarUsuarios();
		for (Usuario user: lista){
			System.out.println(user.getNombre()+" - "+user.getClave());
		}
	}

}
