package modelo.base;

import java.util.Random;
import java.util.Scanner;
import java.util.Timer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Controller.DAO;

public class Main {

	public static void main(String[] args) {
		
		int op = 0;
		//int f;		
		
		DAO dao = new DAO();
		
		dao.Deletar();
		//dao.Atualizar();
		//dao.Inserir();
 
	}
}
