package com.exemple.controledemateriais.repositories;
import com.exemple.controledemateriais.entities.Movimentacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Long> {
}