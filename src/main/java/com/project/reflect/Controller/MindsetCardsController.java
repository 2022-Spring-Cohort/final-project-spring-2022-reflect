package com.project.reflect.Controller;
import com.project.reflect.Model.*;
import com.project.reflect.Repository.MindsetCardsRepository;
import com.project.reflect.Repository.SessionRepository;
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

    @GetMapping("/mindset")
    public Iterable <MindsetCards> getCards() {
        return mindsetCardsRepo.findAll();
    }

    @GetMapping("/mindset/{id}")
    public MindsetCards getMindsetCard (@PathVariable long id){
        return mindsetCardsRepo.findById(id).get();
    }

    @PostMapping("/mindset/addCard")
    public Iterable addMindsetCard(@PathVariable long id,@RequestBody String front, @RequestBody String back) {

        MindsetCards mindsetCard = mindsetCardsRepo.findById(id).get();

        /*TODO
         *
         * Add an optional for adding a post that might not actually be there
         *
         * */
        mindsetCard.addFrontCard(front);
        mindsetCard.addBackCards(back);
        return mindsetCardsRepo.findAll();
    }

    @PatchMapping("/songs/{id}")
    public MindsetCards UpdateMindsetCard (@PathVariable long id, @RequestBody String newFront, @RequestBody String newBack) {
        MindsetCards mindsetCard  = mindsetCardsRepo.findById(id).get();
        mindsetCard.updateFront(newFront);
        mindsetCardsRepo.save(mindsetCard);
        return  mindsetCard;
    }

}