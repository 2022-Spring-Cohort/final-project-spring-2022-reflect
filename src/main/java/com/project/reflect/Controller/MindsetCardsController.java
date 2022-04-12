package com.project.reflect.Controller;
import com.project.reflect.Model.*;
import com.project.reflect.Repository.MindsetCardsRepository;
import com.project.reflect.Repository.UserRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class MindsetCardsController {

    private UserRepository userRepo;
    private MindsetCardsRepository mindsetCardsRepo;


    public MindsetCardsController(UserRepository userRepo, MindsetCardsRepository mindsetCardsRepo) {
        this.userRepo = userRepo;
        this.mindsetCardsRepo = mindsetCardsRepo;
    }

    @GetMapping("/mindset-cards")
    public Iterable <MindsetCards> getCards() {
        return mindsetCardsRepo.findAll();
    }


    @GetMapping("/mindset-cards/{id}")
    public MindsetCards getMindsetCard (@PathVariable long id){
        return mindsetCardsRepo.findById(id).get();
    }

    @PostMapping("/mindset-cards/add-why-card")
    public Iterable addMindsetWhyCard(@RequestBody MindsetCardsWhy newMindsetCard) {
    mindsetCardsRepo.save(newMindsetCard);
        return getCards();
    }

    @PostMapping("/mindset-cards/add-wins-card")
    public Iterable addMindsetWinCard(@RequestBody MindsetCardsWins newMindsetCard) {
        mindsetCardsRepo.save(newMindsetCard);
        return getCards();
    }



    @PatchMapping("/mindset-cards/{id}/card-front")
    public Iterable<MindsetCards> UpdateMindsetFrontCard (@PathVariable long id, @RequestBody String newFront) {
        MindsetCards mindsetCard  = mindsetCardsRepo.findById(id).get();
        mindsetCard.updateFront(newFront);
        mindsetCardsRepo.save(mindsetCard);
        return getCards();
    }


    @PatchMapping("/mindset-cards/{id}/update-card-back")
    public Iterable<MindsetCards> UpdateMindsetBackCard (@PathVariable long id, @RequestBody String newBack) {
        MindsetCards mindsetCard  = mindsetCardsRepo.findById(id).get();
        mindsetCard.updateFront(newBack);
        mindsetCardsRepo.save(mindsetCard);
        return getCards();
    }


    @DeleteMapping("/mindset-cards/{id}/delete")
    public Iterable<MindsetCards> deleteMindsetCard(@PathVariable long id) {
        mindsetCardsRepo.delete(mindsetCardsRepo.findById(id).get());
        return getCards();
    }


}