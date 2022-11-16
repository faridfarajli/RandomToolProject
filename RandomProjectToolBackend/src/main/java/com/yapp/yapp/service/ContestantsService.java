package com.yapp.yapp.service;

import com.yapp.yapp.model.Contestants;
import com.yapp.yapp.repository.ContestantsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;

@Service
public class ContestantsService {

    @Autowired
    private EntityManager entityManager;

    private final ContestantsRepository contestantsRepository;

    public ContestantsService(ContestantsRepository contestantsRepository) {
        this.contestantsRepository = contestantsRepository;
    }

    public Contestants createContestants(Contestants contestants) {
        return contestantsRepository.save(contestants);
    }
}