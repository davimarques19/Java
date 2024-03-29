import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comentario;
import entities.Enviar;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comentario comentario1 = new Comentario("�tima viagem!!!");
		Comentario comentario2 = new Comentario("Maravilha!");
		Enviar env1 = new Enviar(sdf.parse("21/06/2018 13:05:44"), "Viajando para nova zelandia", "Eu estou viajando para visitar um lindo pais", 12);
		env1.addComentario(comentario1);
		env1.addComentario(comentario2);
		
		Comentario comentario3 = new Comentario("Boa noite!!!");
		Comentario comentario4 = new Comentario("OleleOlala!");
		Enviar env2 = new Enviar(sdf.parse("28/07/2018 23:14:19"), "Boa noite galera", "Vejo voc� amanh�", 5);
		env2.addComentario(comentario3);
		env2.addComentario(comentario4);
		
		System.out.println(env1);

		System.out.println(env2);

	}

}
