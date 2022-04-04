package com.project.reflect;

import com.project.reflect.Model.Article;
import com.project.reflect.Model.Book;
import com.project.reflect.Model.User;
import com.project.reflect.Repository.ArticleRepository;
import com.project.reflect.Repository.BookRepository;
import com.project.reflect.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Populator implements CommandLineRunner {
    @Autowired
    private BookRepository bookRepo;
    @Autowired
    private UserRepository userRepo;
    @Autowired
    private ArticleRepository articleRepo;


    @Override
    public void run(String... args) throws Exception {

        User user1 = new User("Joe");
        userRepo.save(user1);
        User user2 = new User("Ben");
        userRepo.save(user2);

        Book book1 = new Book("How to Win Friends and Influence People", "Dale Carnegie");
        bookRepo.save(book1);
        Book book2 = new Book("Tiny Buddha: Simple Wisdom for Life's Hard Questions", "Lori Deschene");
        bookRepo.save(book2);
        Book book3 = new Book("Simple Abundance: A Daybook of Comfort and Joy", "Sarah Ban Breathnach");
        bookRepo.save(book3);
        Book book4 = new Book("The Book of Life: Daily Meditations", "Jiddu, Krishnamuri");
        bookRepo.save(book4);
        Book book5 = new Book("Moments of Mindfulness: Daily Inspiration", "Thich Nhat Hanh");
        bookRepo.save(book5);

        Article article1 = new Article("Test", "Test", "What is the best type of meditation?", "Test Test Test...", "Google.com");
        articleRepo.save(article1);

        Article article2 = new Article("Feeling Overwhelmed? Remember RAIN", "Tara Branch", "./front-end/images/tibetan-bowl.png",
                "Over the last several decades, through my work with tens of thousands of clients and meditation students, I’ve come to see the pain of perceived...",
                "https://www.mindful.org/tara-brach-rain-mindfulness-practice/");
        articleRepo.save(article2);

        Article article3 = new Article("Five Ways Mindfulness Meditation Is Good for Your Health", "Jill Suittie", "./front-end/images/tibetan-bowl.png",
                "According to thousands of years of tradition, Buddhists meditate to understand themselves and their connections to all beings. By doing so, they hope to be released from suffering and ultimately gain enlightenment.",
                "https://greatergood.berkeley.edu/article/item/five_ways_mindfulness_meditation_is_good_for_your_health");
        articleRepo.save(article3);

        Article article4 = new Article("Mindfulness Makeover: How To 'Just Be' No Matter What", "Sarah Jeanne Browne", "./front-end/images/tibetan-bowl.png",
                "Stressed and struggling? If you are having a hard day, and you can’t get out of your own head, mindfulness may be for you. You can’t always turn the mind off. That’s not what mindfulness is...",
        "https://www.forbes.com/sites/womensmedia/2021/01/21/mindfulness-makeover-how-to-just-be-no-matter-what/");
        articleRepo.save(article4);

        Article article5 = new Article("6 Ways to Practice Mindful Eating", "Christopher Willard", "./front-end/images/tibetan-bowl.png",
                "Eating as mindfully as we do on retreat or in a mindfulness course is not realistic for many of us, especially with families, jobs, and the myriad distractions around us. This is not to mention that our friends, family and...",
                "https://www.mindful.org/6-ways-practice-mindful-eating/");
        articleRepo.save(article5);

        Article article6 = new Article("Train Your Mind to Work Smarter", "Tara Healey", "./front-end/images/tibetan-bowl.png",
                "Office politics. Dictatorial bosses. Coworkers’ emotions bouncing up and down and sideways. An uncertain economy and a volatile job market. Escalating levels of expectation. Loss of direction. Too much to do. Too little time. Not enough sleep...",
                "https://www.mindful.org/putting-mindfulness-to-work/");
        articleRepo.save(article6);

        Article article7 = new Article("How to Make Meditation a Daily Habit", "Jack Kornfield", "./front-end/images/tibetan-bowl.png",
                "Awareness of your breath can serve as a steady basis for awareness in all you do. Explore this six-step practice to make mindfulness part of your daily routine...",
        "https://www.mindful.org/developing-a-daily-practice/");
        articleRepo.save(article7);

        Article article8 = new Article("What is the best type of meditation?", "Daniel Bubins", "What is the best type of meditation?",
                "Meditation offers time for relaxation and heightened awareness in a stressful world where our senses are often dulled. Research suggests that meditation has the potential for more than just temporary stress relief...",
                "https://www.medicalnewstoday.com/articles/320392");
        articleRepo.save(article8);

        Article article9 = new Article("How to be more empathetic", "Headspace","./front-end/images/tibetan-bowl.png",
                "When we are able to stand in another person’s shoes and see life from their point of view — a situation, a belief, a struggle — we are then better equipped to connect, without reactivity, on a human level...",
                "https://www.headspace.com/articles/how-to-be-more-empathetic");
        articleRepo.save(article9);




    }}
