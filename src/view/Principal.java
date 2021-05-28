package view;

import java.io.IOException;

import controller.ArquivosController;
import controller.IArquivosController;

public class Principal {

	public static void main(String[] args) {

		IArquivosController arqCont = new ArquivosController();
		String dirWin = "C:\\Windows";
		String patch = "C:\\TEMP\\Aula";
		String nome = "teste";
		
		try {
			arqCont.readDir(dirWin);
			arqCont.createFile(patch, nome);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
