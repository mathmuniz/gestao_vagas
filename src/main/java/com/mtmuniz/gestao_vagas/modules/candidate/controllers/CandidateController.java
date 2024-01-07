package com.mtmuniz.gestao_vagas.modules.candidate.controllers;

import com.mtmuniz.gestao_vagas.modules.candidate.CandidateEntity;
import com.mtmuniz.gestao_vagas.modules.candidate.CandidateRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

    @Autowired
    private CandidateRepository canditateRepository;
    @PostMapping("/")
    public CandidateEntity create( @Valid @RequestBody CandidateEntity candidateEntity) {
        return this.canditateRepository.save(candidateEntity);
    }
}
