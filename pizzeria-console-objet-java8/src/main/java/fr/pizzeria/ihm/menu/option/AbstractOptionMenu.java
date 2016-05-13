package fr.pizzeria.ihm.menu.option;

import java.sql.SQLException;
import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.exception.DaoException;

public abstract class AbstractOptionMenu {
	private String libelle;
	protected IPizzaDao pizzaDao;
	protected Scanner sc;
	
	public AbstractOptionMenu(String libelle) {
		super();
		this.libelle = libelle;
	}
	
	public AbstractOptionMenu(String libelle, IPizzaDao pizzaDao) {
		this(libelle);
		this.pizzaDao = pizzaDao;
	}

	public AbstractOptionMenu(String libelle, IPizzaDao pizzaDao, Scanner sc) {
		this(libelle, pizzaDao);
		this.sc = sc;
	}

	public abstract boolean execute() throws DaoException, SQLException;

	public String getLibelle() {
		return libelle;
	}
	
}
