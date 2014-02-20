package _Arranque;
import gui.Menu;

// esta es la versión opcional
public class Principal {
	public static void main(String[] args) {
		try {
			new Menu().iniciar();
		} catch (ExceptionInInitializerError e) {
			e.printStackTrace();
		}
	}
}

