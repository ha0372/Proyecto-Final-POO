package com.unab.SpringApp.DAO;

import org.springframework.data.repository.CrudRepository;

import com.unab.SpringApp.Entidades.Comida;

public interface ComidaDAO extends CrudRepository<Comida, Long> {

}
