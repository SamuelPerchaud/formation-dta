package fr.pizzeria.dao.test_implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;

import fr.pizzeria.dao.config.PizzaDaoConfigJPA;
import fr.pizzeria.dao.pizza.IPizzaDao;

@ContextConfiguration(classes=PizzaDaoConfigJPA.class)
public class PizzaDaoJPASpringTest extends GenericPizzaDaoSpringTest {
	
	@Autowired
	public void setPizzaDao(@Qualifier("pizzaDaoJPASpring") IPizzaDao pizzaDao) {
		this.pizzaDao = pizzaDao;
	}

}
