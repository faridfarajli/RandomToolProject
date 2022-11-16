package com.yapp.yapp.controller;

import com.yapp.yapp.model.Contestants;
import com.yapp.yapp.repository.ContestantsRepository;
import com.yapp.yapp.service.ContestantsService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/contestants")
@CrossOrigin
public class ContestantsController {
    private final ContestantsService contestantsService;
    private final ContestantsRepository contestantsRepository;

    public ContestantsController(ContestantsService contestantsService, ContestantsRepository contestantsRepository) {
        this.contestantsService = contestantsService;
        this.contestantsRepository = contestantsRepository;
    }

    @PostMapping("/new")
      public Contestants createContestants(@RequestBody Contestants contestants){
        return contestantsService.createContestants(contestants);

   }

    @GetMapping("/find/{yc}/{date}/{date2}/{ysv}/{ysv2}")
    public List<Contestants> findByAllDate(
                                           @PathVariable("yc") String yc,
                                           @PathVariable("date") long date,
                                           @PathVariable("date2") long date2,
                                           @PathVariable("ysv") long ysv,
                                           @PathVariable("ysv2") long ysv2){
        return contestantsRepository.findByYcBetweenAndDateAndYsvBetween(yc,date,date2,ysv,ysv2);
    }
}
