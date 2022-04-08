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
    public Iterable addMindsetWhyCard(@PathVariable long id,@RequestBody String front, @RequestBody String back) {

        MindsetCardsWhy mindsetCard = (MindsetCardsWhy) mindsetCardsRepo.findById(id).get();
        mindsetCard.addFrontCard(front);
        mindsetCard.addBackCards(back);
        return mindsetCardsRepo.findAll();
    }

    @PostMapping("/mindset-cards/add-wins-card")
    public Iterable addMindsetWinCard(@PathVariable long id,@RequestBody String front, @RequestBody String back) {

        MindsetCardsWins mindsetCard = (MindsetCardsWins) mindsetCardsRepo.findById(id).get();

        mindsetCard.addFrontCard(front);
        mindsetCard.addBackCards(back);
        return mindsetCardsRepo.findAll();
    }


    @PatchMapping("/mindset-cards/{id}")
    public MindsetCards UpdateMindsetWhyFrontCard (@PathVariable long id, @RequestBody String newFront) {
        MindsetCardsWhy mindsetCard  = (MindsetCardsWhy) mindsetCardsRepo.findById(id).get();
        mindsetCard.updateFront(newFront);
        mindsetCardsRepo.save(mindsetCard);
        return  mindsetCard;
    }


    @PatchMapping("/mindset-cards/{id}")
    public MindsetCards UpdateMindsetWhyBackCard (@PathVariable long id, @RequestBody String newBack) {
        MindsetCardsWhy mindsetCard  = (MindsetCardsWhy) mindsetCardsRepo.findById(id).get();
        mindsetCard.updateFront(newBack);
        mindsetCardsRepo.save(mindsetCard);
        return  mindsetCard;
    }

    @PatchMapping("/mindset-cards/{id}")
    public MindsetCards UpdateMindsetWinsFrontCard (@PathVariable long id, @RequestBody String newFront) {
        MindsetCardsWins mindsetCard  = (MindsetCardsWins) mindsetCardsRepo.findById(id).get();
        mindsetCard.updateFront(newFront);
        mindsetCardsRepo.save(mindsetCard);
        return  mindsetCard;
    }

    @PatchMapping("/mindset-cards/{id}")
    public MindsetCards UpdateMindsetWinsBackCard (@PathVariable long id, @RequestBody String newBack) {
        MindsetCardsWins mindsetCard  = (MindsetCardsWins) mindsetCardsRepo.findById(id).get();
        mindsetCard.updateFront(newBack);
        mindsetCardsRepo.save(mindsetCard);
        return  mindsetCard;
    }

    @DeleteMapping("/mindset-cards/{id}")
    public Iterable<MindsetCards> deleteMindsetWhyCard(@PathVariable long id)
    {
        mindsetCardsRepo.delete(mindsetCardsRepo.findById(id).get());
        return  mindsetCardsRepo.findAll();
    }

    @DeleteMapping("/mindset-cards/{id}")
    public Iterable<MindsetCards> deleteMindsetWinCard(@PathVariable long id)
    {
        mindsetCardsRepo.delete(mindsetCardsRepo.findById(id).get());
        return  mindsetCardsRepo.findAll();
    }


}