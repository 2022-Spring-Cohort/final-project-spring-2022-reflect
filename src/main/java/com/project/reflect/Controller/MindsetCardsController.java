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
    public Iterable<MindsetCardsWhy> getWhyCards(@PathVariable long id) {
        User user = userRepo.findById(id).get();

        return user.getMindsetCardsWhy();
    }


    @GetMapping("/users/{id}/mindset-wins-cards")
    public Iterable<MindsetCardsWins> getWinsCards(@PathVariable long id) {
        User user = userRepo.findById(id).get();

        return user.getMindsetCardsWins();
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
        return user.getMindsetCardsWhy();
    }

    @PostMapping("/user/{id}/mindset-cards/add-wins-card")
    public Iterable addMindsetWinsCard(@RequestBody MindsetCardsWins newMindsetCard, @PathVariable long id) {
        User user = userRepo.findById(id).get();
        newMindsetCard.setUser(user);
        mindsetCardsWinsRepo.save(newMindsetCard);
        return user.getMindsetCardsWins();
    }


    @DeleteMapping("/user/{id}/mindset-why-cards/{id1}/delete")
    public Iterable<MindsetCardsWhy> deleteMindsetWhyCard(@PathVariable long id, @PathVariable long id1) {
        User user = userRepo.findById(id).get();
        mindsetCardsWhyRepo.delete(mindsetCardsWhyRepo.findById(id1).get());
        return user.getMindsetCardsWhy();
    }


    @DeleteMapping("/user/{id}/mindset-wins-cards/{id1}/delete")
    public Iterable<MindsetCardsWins> deleteMindsetWinsCard(@PathVariable long id, @PathVariable long id1) {
        User user = userRepo.findById(id).get();
        mindsetCardsWinsRepo.delete(mindsetCardsWinsRepo.findById(id1).get());
        return user.getMindsetCardsWins();
    }

}