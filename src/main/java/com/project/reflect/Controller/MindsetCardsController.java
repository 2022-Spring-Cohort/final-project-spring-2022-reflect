package com.project.reflect.Controller;
import com.project.reflect.Model.Comments;
import com.project.reflect.Model.MindsetCards;
import com.project.reflect.Model.Session;
import com.project.reflect.Model.User;
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
    public Iterable getCards() {
        return mindsetCardsRepo.findAll();
    }

    @GetMapping("/mindset/{id}")
    public MindsetCards getMindsetCard (@PathVariable long id){
        return mindsetCardsRepo.findById(id).get();
    }

    @PostMapping("/mindset/{id}/addCard/")
    public Iterable addMindsetCard(@PathVariable long id,@RequestBody Session session) {
        MindsetCards mindsetCard = mindsetCardsRepo.findById(id).get();

       /*TODO
       *
       * Add an optional for adding a post that might not actually be there*/

        return mindsetCardsRepo.findAll();
    }

}