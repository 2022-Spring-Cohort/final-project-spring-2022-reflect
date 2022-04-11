package com.project.reflect;

import com.project.reflect.Model.*;
import com.project.reflect.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class Populator implements CommandLineRunner {
    @Autowired
    private BookRepository bookRepo;
    @Autowired
    private UserRepository userRepo;
    @Autowired
    private SessionRepository sessionRepo;
    @Autowired
    private ArticleRepository articleRepo;
    @Autowired
    private TopicRepository topicRepo;
    @Autowired
    TimerRepository timerRepo;
    @Autowired
    private MindsetCardsRepository mindsetCardsRepo;


    @Override
    public void run(String... args) throws Exception {

        User user1 = new User("Joe");
        userRepo.save(user1);
        User user2 = new User("Ben");
        userRepo.save(user2);

        Timer timer1 = new Timer(5, user1);
        timerRepo.save(timer1);

        Session session1 = new Session("4/5/22", 10, "Had a hard time clearing my mind this morning.", user1);
        sessionRepo.save(session1);
        Session session2 = new Session("4/6/22", 20, "My mind was racing this afternoon, but I focused on noticing each thought and letting it go.", user1);
        sessionRepo.save(session2);
        Session session3 = new Session("4/7/22", 0, "Just couldn't today, very busy", user1);
        sessionRepo.save(session3);
        Session session4 = new Session("4/5/22", 5, "I'm giving this a shot.", user2);
        sessionRepo.save(session4);

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

        Topic topicMeditation = new Topic("Meditation");
        topicRepo.save(topicMeditation);
        Topic topicSleep = new Topic("Sleep");
        topicRepo.save(topicSleep);
        Topic topicAnxiety = new Topic("Anxiety");
        topicRepo.save(topicAnxiety);
        Topic topicMindfulness = new Topic("Mindfulness");
        topicRepo.save(topicMindfulness);
        Topic topicFocus = new Topic("Focus");
        topicRepo.save(topicFocus);
        Topic topicWork = new Topic("Work");
        topicRepo.save(topicWork);
        Topic topicProducts = new Topic("Products");
        topicRepo.save(topicProducts);

        Article article2 = new Article("Feeling Overwhelmed? Remember RAIN", "Tara Branch", "./images/meditationpics/Anxiety-2.jpg",
                "Over the last several decades, through my work with tens of thousands of clients and meditation students, I’ve come to see the pain of perceived...",
                "https://www.mindful.org/tara-brach-rain-mindfulness-practice/",topicAnxiety);
        articleRepo.save(article2);

        Article article3 = new Article("Five Ways Mindfulness Meditation Is Good for Your Health", "Jill Suittie", "./images/meditationpics/engaged-mindfuness.jpg",
                "According to thousands of years of tradition, Buddhists meditate to understand themselves and their connections to all beings. By doing so, they hope to be released from suffering and ultimately gain enlightenment.",
                "https://greatergood.berkeley.edu/article/item/five_ways_mindfulness_meditation_is_good_for_your_health", topicMindfulness);
        articleRepo.save(article3);


        Article article4 = new Article("Mindfulness Makeover: How To 'Just Be' No Matter What", "Sarah Jeanne Browne", "./images/meditationpics/meditation.jpg",

                "Stressed and struggling? If you are having a hard day, and you can’t get out of your own head, mindfulness may be for you. You can’t always turn the mind off. That’s not what mindfulness is...",
        "https://www.forbes.com/sites/womensmedia/2021/01/21/mindfulness-makeover-how-to-just-be-no-matter-what/", topicMeditation);
        articleRepo.save(article4);


        Article article5 = new Article("6 Ways to Practice Mindful Eating", "Christopher Willard", "./images/meditationpics/How-To-More-Mindful.png",

                "Eating as mindfully as we do on retreat or in a mindfulness course is not realistic for many of us, especially with families, jobs, and the myriad distractions around us. This is not to mention that our friends, family and...",
                "https://www.mindful.org/6-ways-practice-mindful-eating/", topicMindfulness);
        articleRepo.save(article5);

        Article article6 = new Article("Train Your Mind to Work Smarter", "Tara Healey", "./images/meditationpics/mindfullness-TA.webp",
                "Office politics. Dictatorial bosses. Coworkers’ emotions bouncing up and down and sideways. An uncertain economy and a volatile job market. Escalating levels of expectation. Loss of direction. Too much to do. Too little time. Not enough sleep...",
                "https://www.mindful.org/putting-mindfulness-to-work/", topicMindfulness);
        articleRepo.save(article6);

        Article article7 = new Article("How to Make Meditation a Daily Habit", "Jack Kornfield", "./images/meditationpics/meditation3.webp",
                "Awareness of your breath can serve as a steady basis for awareness in all you do. Explore this six-step practice to make mindfulness part of your daily routine...",
        "https://www.mindful.org/developing-a-daily-practice/", topicMeditation);
        articleRepo.save(article7);

        Article article8 = new Article("What is the best type of meditation?", "Daniel Bubins", "./images/meditationpics/meditator.jpg",
                "Meditation offers time for relaxation and heightened awareness in a stressful world where our senses are often dulled. Research suggests that meditation has the potential for more than just temporary stress relief...",
                "https://www.medicalnewstoday.com/articles/320392", topicMeditation);
        articleRepo.save(article8);

        Article article9 = new Article("How to be more empathetic", "Headspace","./images/meditationpics/mindful4.jpg",
                "When we are able to stand in another person’s shoes and see life from their point of view — a situation, a belief, a struggle — we are then better equipped to connect, without reactivity, on a human level...",
                "https://www.headspace.com/articles/how-to-be-more-empathetic", topicMindfulness);
        articleRepo.save(article9);

        Article article10 = new Article("The effect of mindfulness meditation on sleep quality", "Ann Acad", "./images/meditationpics/mindful4.jpg",
                "There is a growing interest in the effectiveness of mindfulness meditation for sleep disturbed populations. Our study sought to evaluate the effect of mindfulness meditation interventions on sleep quality. To assessTo assess for relative efficacy, comparator groups were restricted to specific active controls (such as evidenced-based sleep treatments) and nonspecific active controls (such as time/attention-matched interventions to control for placebo effects), which were analyzed separately.\n",
                "https://www.ncbi.nlm.nih.gov/pmc/articles/PMC6557693/\n", topicSleep);
        articleRepo.save(article10);


        ArrayList<String> list1= new ArrayList<>();




        list1.add("why details 1");
        list1.add("why details 2");
        MindsetCards mindsetCard1 = new MindsetCardsWhy(user1,"why1", String.valueOf(list1));
mindsetCardsRepo.save(mindsetCard1);




        ArrayList<String> list2= new ArrayList<>();



        list2.add("why details 3");
        list2.add("why details 4");
        MindsetCards mindsetCard2 = new MindsetCardsWhy(user2,"why2", String.valueOf(list2));
        mindsetCardsRepo.save(mindsetCard2);


        ArrayList<String> list3= new ArrayList<>();


        list3.add("why details 5");
        list3.add("why details 6");

        MindsetCards mindsetCard3 = new MindsetCardsWhy(user1,"why3", String.valueOf(list3));


        mindsetCardsRepo.save(mindsetCard3);



        ArrayList<String> list4= new ArrayList<>();


        list4.add("win details 1");
        list4.add("win details 2");

        MindsetCards mindsetCard4 = new MindsetCardsWins(user1,"win1", String.valueOf(list4));


        mindsetCardsRepo.save(mindsetCard4);




        ArrayList<String> list5= new ArrayList<>();


        list5.add("win details 3");
        list5.add("win details 4");

        MindsetCards mindsetCard5 = new MindsetCardsWins(user2,"win2", String.valueOf(list5));


        mindsetCardsRepo.save(mindsetCard5);






    }}
