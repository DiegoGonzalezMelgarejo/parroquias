package com.parroquia.api.dao;

import java.util.List;

import com.parroquia.api.models.entity.Cliente;

public interface IClienteDao {

	public List<Cliente> findAll();
}
