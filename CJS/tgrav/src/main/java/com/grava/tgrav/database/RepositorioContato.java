package com.grava.tgrav.database;

import com.grava.tgrav.entidade.Contato;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioContato extends JpaRepository<Contato, Long> {
    
}
