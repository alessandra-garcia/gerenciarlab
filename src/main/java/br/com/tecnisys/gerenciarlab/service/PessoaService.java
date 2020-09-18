package br.com.tecnisys.gerenciarlab.service;

import br.com.tecnisys.gerenciarlab.entity.Pessoa;
import br.com.tecnisys.gerenciarlab.repository.PessoaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    private final PessoaRepository repository;

    public PessoaService(PessoaRepository pessoaRepository) {
        this.repository = pessoaRepository;
    }

    public List<Pessoa> listAll(){
        return  repository.findAll();
    }
}
