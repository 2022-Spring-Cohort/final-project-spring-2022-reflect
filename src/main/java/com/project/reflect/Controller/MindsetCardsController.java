package com.project.reflect.Controller;
import com.project.reflect.Model.*;
import com.project.reflect.Repository.MindsetCardsWhyRepository;
import com.project.reflect.Repository.MindsetCardsWinsRepository;
import com.project.reflect.Repository.UserRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class MindsetCardsController {

    private UserRepository userRepo;

    private MindsetCardsWhyRepository mindsetCardsWhyRepo;
    private MindsetCardsWinsRepository mindsetCardsWinsRepo;


    public MindsetCardsController(UserRepository userRepo, MindsetCardsWhyRepository mindsetCardsWhyRepo, MindsetCardsWinsRepository mindsetCardsWinsRepo) {
        this.userRepo = userRepo;
        this.mindsetCardsWhyRepo = mindsetCardsWhyRepo;
        this.mindsetCardsWinsRepo = mindsetCardsWinsRepo;
    }


    @GetMapping("/users/{id}/mindset-why-cards")
    public Iterable<MindsetCardsWhy> getWhyCards() {
        return mindsetCardsWhyRepo.findAll();
            }


    @GetMapping("/users/{id}/mindset-wins-cards")
    public Iterable<MindsetCardsWins> getWinsCards() {
        return mindsetCardsWinsRepo.findAll();
    }



    @GetMapping("/mindset-why-cards/{id}")
    public MindsetCardsWhy getMindsetWhyCard(@PathVariable long id) {
        return mindsetCardsWhyRepo.findById(id).get();
    }


    @GetMapping("/mindset-wins-cards/{id}")
    public MindsetCardsWins getMindsetWinCard(@PathVariable long id) {
        return mindsetCardsWinsRepo.findById(id).get();
    }

    @PostMapping("/user/{id}/mindset-cards/add-why-card")
    public Iterable addMindsetWhyCard(@RequestBody MindsetCardsWhy newMindsetCard, @PathVariable long id) {
        User user = userRepo.findById(id).get();
        newMindsetCard.setUser(user);
        mindsetCardsWhyRepo.save(newMindsetCard);
        return getWhyCards();
    }

    @PostMapping("/user/{id}/mindset-cards/add-wins-card")
    public Iterable addMindsetWinsCard(@RequestBody MindsetCardsWins newMindsetCard, @PathVariable long id) {
        User user = userRepo.findById(id).get();
        newMindsetCard.setUser(user);
        mindsetCardsWinsRepo.save(newMindsetCard);
        return getWinsCards();
    }


    @DeleteMapping("/mindset-why-cards/{id}/delete")
    public Iterable<MindsetCardsWhy> deleteMindsetWhyCard(@PathVariable long id) {
        mindsetCardsWhyRepo.delete(mindsetCardsWhyRepo.findById(id).get());
        return getWhyCards();
    }


    @DeleteMapping("/mindset-win-cards/{id}/delete")
    public Iterable<MindsetCardsWins> deleteMindsetWinCard(@PathVariable long id) {
        mindsetCardsWinsRepo.delete(mindsetCardsWinsRepo.findById(id).get());
        return getWinsCards();


    }

}