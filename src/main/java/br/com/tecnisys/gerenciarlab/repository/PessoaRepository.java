package br.com.tecnisys.gerenciarlab.repository;

import br.com.tecnisys.gerenciarlab.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
