package com.project.reflect.Controller;
import com.project.reflect.Model.*;
import com.project.reflect.Repository.MindsetCardsRepository;
import com.project.reflect.Repository.MindsetCardsWhyRepository;
import com.project.reflect.Repository.MindsetCardsWinsRepository;
import com.project.reflect.Repository.UserRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class MindsetCardsController {

    private UserRepository userRepo;
    private MindsetCardsRepository mindsetCardsRepo;
    private MindsetCardsWhyRepository mindsetCardsWhyRepo;
    private MindsetCardsWinsRepository mindsetCardsWinsRepo;


    public MindsetCardsController(UserRepository userRepo, MindsetCardsRepository mindsetCardsRepo, MindsetCardsWhyRepository mindsetCardsWhyRepo, MindsetCardsWinsRepository mindsetCardsWinsRepo) {
        this.userRepo = userRepo;
        this.mindsetCardsRepo = mindsetCardsRepo;
        this.mindsetCardsWhyRepo = mindsetCardsWhyRepo;
        this.mindsetCardsWinsRepo = mindsetCardsWinsRepo;
    }

    @GetMapping("/mindset-why-cards")
    public Iterable <MindsetCardsWhy> getWhyCards() {
        return mindsetCardsWhyRepo.findAll();
    }


    @GetMapping("/mindset-wins-cards")
    public Iterable <MindsetCardsWins> getWinCards() {
        return mindsetCardsWinsRepo.findAll();
    }

    @GetMapping("/mindset-why-cards/{id}")
    public MindsetCardsWhy getMindsetWhyCard (@PathVariable long id){
        return mindsetCardsWhyRepo.findById(id).get();
    }


    @GetMapping("/mindset-wins-cards/{id}")
    public MindsetCardsWins getMindsetWinCard (@PathVariable long id){
        return mindsetCardsWinsRepo.findById(id).get();
    }

    @PostMapping("/mindset-cards/add-why-card")
    public Iterable addMindsetWhyCard(@RequestBody MindsetCardsWhy newMindsetCard) {

    mindsetCardsRepo.save(newMindsetCard);
        return getWhyCards();
    }

    @PostMapping("/mindset-cards/add-wins-card")
    public Iterable addMindsetWinCard(@RequestBody MindsetCardsWins newMindsetCard) {
        mindsetCardsRepo.save(newMindsetCard);
        return getWinCards();
    }



    @DeleteMapping("/mindset-why-cards/{id}/delete")
    public Iterable<MindsetCardsWhy> deleteMindsetWhyCard(@PathVariable long id) {
        mindsetCardsRepo.delete(mindsetCardsRepo.findById(id).get());
        return getWhyCards();
    }



    @DeleteMapping("/mindset-win-cards/{id}/delete")
    public Iterable<MindsetCardsWins> deleteMindsetWinCard(@PathVariable long id) {
        mindsetCardsRepo.delete(mindsetCardsRepo.findById(id).get());
        return getWinCards();
    }


}