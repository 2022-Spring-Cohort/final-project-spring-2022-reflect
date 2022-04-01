package com.project.reflect;

import com.project.reflect.Model.Article;
import com.project.reflect.Model.Book;
import com.project.reflect.Model.User;
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


    @Override
    public void run(String... args) throws Exception {

        User user1 = new User("Joe");
        userRepo.save(user1);
        User user2 = new User("Ben");
        userRepo.save(user2);

        Book book1 = new Book("How to Win Friends and Influence People", "Dale Carnegie");
        Book book2 = new Book("Tiny Buddha: Simple Wisdom for Life's Hard Questions", "Lori Deschene");
        Book book3 = new Book("Simple Abundance: A Daybook of Comfort and Joy", "Sarah Ban Breathnach");
        Book book4 = new Book("The Book of Life: Daily Meditations", "Jiddu, Krishnamuri");
        Book book5 = new Book("Moments of Mindfulness: Daily Inspiration", "Thich Nhat Hanh");

        Article article1 = new Article("Nayaswami Diksha",
                "Musk is a kind of valuable, extremely fragrant salve found in the navel of the musk deer, a habitant of the highest Himalayan Hills of India. At a certain age, the ravishing odor of musk secretly oozes out of the navel of the musk deer. The deer becomes excited at the attractive odor of musk and frisks about, sniffing under trees, and searching everywhere for many weeks to find the source of the fragrance. Finally he grows angry and very restless when he is unable to find the source of the musk perfume, and jumps from the high cliffs into the valley, trying to reach the source of the rare fragrance, and thus plunges to death. It is then that the hunters get hold of him and tear out the pouch of musk.\n" +
                        "\n" +
                        "A divine Bard once sang: “O you foolish musk deer, you sought for the fragrance everywhere but in your own body. That is why you did not find it. If you only had touched your nostrils to your own navel, you would have found the cherished musk and would have saved yourself from suicide on the rocks below.”\n" +
                        "\n" +
                        "Don’t you think that most people act like the musk deer? As they grow, they seek the ever-fragrant happiness everywhere outside of themselves – in play, temptation, human love, and on the slippery path of wealth, until finally they jump from the cliff of high hope onto the rocks of disillusionment when they cannot find the real happiness which lies hidden within the secret recesses of their own Souls.\n" +
                        "\n" +
                        "If only you would turn your mind inward, in deep daily meditation, you would find the source of all true, lasting happiness existing right within the innermost silence of your own Soul. Don’t be like the musk deer and perish seeking false happiness in the wrong place. Beloved seekers of happiness awake and try to find your happiness within the cave of deep contemplation.",
                "Happiness is Within – The Himalayan Musk Deer");
        Article article2 = new Article("Diksha McCord",
                "In India, the mahoot (elephant trainer), trains the elephant from babyhood to hold a ‘baton’ (a wooden stick) in it’s trunk to keep it from picking up fruits from the marketplace stalls, as it passes through the market.\n" +
                        "\n" +
                        "Similarly: to prevent the mind from getting distracted, we concentrate on the breath and use a mantra.",
                "Concentration – The Elephant and the Wooden Stick");
        Article article3 = new Article("Nayaswami Anandi",
                "\n" +
                        "\n" +
                        "Recently, I had a beautiful experience with the power of the inner Self during a course called How to Be Happy All the Time.\n" +
                        "\n" +
                        "One of the guests came to Ananda to escape the pain of a separation and divorce initiated two short weeks before her arrival – after 30 years of marriage. The painful circumstances of that divorce are the kind for which people do years of therapy.  (This woman also had also seen a therapist before coming here.)\n" +
                        "\n" +
                        "In the class I shared that the American Medical Association is now saying that the more energy a person has in the prefrontal lobes, the happier his life is, and further, that the best way to bring energy to the prefrontal lobes is meditation. We dived into the ancient science of Hong-Sau meditation. A complete novice to the concept of meditation, my newly divorced friend gave it her all in the 3 short days she was here.\n" +
                        "\n" +
                        "After she got home, she wrote to say that though divorce after 30 years is not easy, she is at peace, and enjoying her quiet time, and her time to meditate. She is meditating, affirming, and praying daily.\n" +
                        "\n" +
                        "Though I was not surprised, I am once again deeply moved by the power of meditation to change people. Recently, I have been meeting many guests at The Expanding Light who are facing very challenging circumstances in their lives. During a recent First-Timers’ Week, after each person introduced why they had come, part of me inwardly gasped at the enormity of the challenges each of them faced. After all the introductions were completed, the group shared my quiet awe at all that had been shared.\n" +
                        "\n" +
                        "At the same time, another part of me KNEW and said, “During this week, you will learn to touch a part of your inner Self through meditation. From that inner connection, you will find the strength, peace, and wisdom to move forward with confidence.” And this is exactly what happened.\n" +
                        "\n" +
                        "Again and again, I offer my gratitude and profound appreciation for the power of yoga meditation.\n",
                "Karma Doesn’t Have to Take Forever");
        Article article4 = new Article("Nan-in", "\n" +
                "\n" +
                "Nan-in, a Japanese master during the Meiji era (1868-1912), received a university professor who came to inquire about Zen.\n" +
                "\n" +
                "Nan-in served tea. He poured his visitor’s cup full, and then kept on pouring.\n" +
                "\n" +
                "The professor watched the overflow until he no longer could restrain himself. “It is overfull. No more will go in!”\n" +
                "\n" +
                "“Like this cup,” Nan-in said, “you are full of your own opinions and speculations. How can I show you Zen unless you first empty your cup?”\n",
                "A cup of Tea");
        Article article5 = new Article("Unknown", "\n" +
                "\n" +
                "Five children were playing this Wishing Game. The first one was asked, “If you had a wish what would you want” and the child said, “If I had a wish I would want an ice cream.” She liked ice cream.\n" +
                "\n" +
                "The second child who was a little bit older said, “If I had a wish I’d wish for an ice cream factory.” The first child thought that was really clever because if you had an ice cream factory you could get an ice cream whenever you wanted one. Not just one ice cream but hundreds of ice creams.\n" +
                "\n" +
                "The third child was asked, “What’s your wish” and he said, “I’d like a billion dollars. Because with a billion dollars I can buy an ice cream factory, a cake factory, a fish and chip shop or whatever else I want, and I could do a lot more”. The first two kids thought, ‘Wow! Aren’t we stupid? Why didn’t we have think of that?’ They thought that this young fellow who wished for a billion dollars was a genius.\n" +
                "\n" +
                "But the next child when asked what he wished did even better than wanting a billion dollars, he said, “I wish I had three wishes, so that I could wish for an ice cream factory with my first wish, a billion dollars with my second wish, and with my third wish I could wish for another three wishes.”\n" +
                "\n" +
                "They thought, ‘Wow! You can’t do better than that.’ Can you think of a wish that is even better than that – to have three wishes and the third wish is that you can wish for another three wishes?\n" +
                "\n" +
                "But the last child did surpass that, he was the Buddha to be, and said, “I wish I had no wishes.”\n" +
                "\n" +
                "Isn’t that interesting? \n" +
                "\n" +
                "Imagine what it would be like if you had no more wishes, completely happy with whatever comes along, completely happy with this present moment. You don’t wish for it to be anything else. \n",
                "What's your Wish?");
        Article Article6 = new Article("Diksha McCord",
                "Years ago, I felt betrayed by someone whom I had fully trusted. The pain in my heart was overwhelming, so I took this into meditation. I prayed deeply to Yogananda to help me overcome the pain. When I didn’t receive an answer, I realized that I first needed to calm my emotions. After three months of daily prayer and self-offering, the pain in my heart subsided and I was able to fully accept and forgive the other person. After that, in meditation, I received a clear answer and understood why I needed to go through this experience.\n" +
                        "\n" +
                        "Evenmindedness bestows clarity of perception, which is the ability to see things as they really are, undistorted by emotional bias. Only when we are even-minded – not reacting emotionally to outward events — can we access the joy of the soul.\n" +
                        "\n" +
                        "Paramhansa Yogananda shared the story of a time in the ashram of his guru, Swami Sri Yukteswar. Month after month with great devotion, Yogananda was seeking God, yet he was experiencing a sort of stagnation. When he asked Sri Yukteswar about it, his guru said:\n" +
                        "\n" +
                        "You think that if you had more mental power or more miracle power you would realize more fully that God is with you. But that is not so. Suppose He responded by giving you control over the whole universe. Possession of such power would leave your heart still unsatisfied.\n" +
                        "\n" +
                        "    God is the Ever-New Joy you already feel in meditation. When man loves that Joy above everything else, more than his indulgences in moods, habits, and sensory experiences, God will open the way. Few devotees are prepared to make such “sacrifices.”\n" +
                        "\n" +
                        "By identifying with our emotions and holding onto our attachments, we lose the awareness of our superconscious potential and our expanded reality and allow ourselves to remain in the limited consciousness of the ego.\n" +
                        "Controlling the Emotions\n" +
                        "\n" +
                        "How can we control our emotions and our mental states to attain the state of superconsciousness? Swami Kriyananda explains the process in Awaken to Superconsciousness:\n" +
                        "\n" +
                        "The way is to practice the Hong-Sau meditation technique for interiorizing the mind.\n" +
                        "\n" +
                        "    The mantra Hong-Sau has a vibratory connection with the breath through its resonance in the medulla oblongata, which controls the breath (as well as the pulse rate and the blood pressure).\n" +
                        "\n" +
                        "    The medulla oblongata is the seat of ego-consciousness. And the spiritual path may be defined as a process of transcending ego-consciousness in the realization of our true Self: the soul. The mantra Hong-Sau, in Sanskrit, means “I am Spirit.”\n" +
                        "\n" +
                        "    “Hong” vibrates with the incoming breath; “Sau,” with the outgoing. The two sounds together bring our breathing gradually into a state of peace and equilibrium.\n" +
                        "\n" +
                        "    There is a subtle connection between the physical breath and the movement of energy in the astral body.\n" +
                        "\n" +
                        "    For along the spine, on either side of it, run the two ganglionated cords of the sympathetic nervous system.\n" +
                        "\n" +
                        "These cords have their counterpart in the astral body, where they are known in the yoga teachings as ida (on the left side of the spine) and pingala (on the right side).\n" +
                        "The Reactive Process\n" +
                        "\n" +
                        "When we inhale, there is a corresponding upward movement of energy in the ida nerve channel. When we exhale, there is a downward movement in the pingala.\n" +
                        "\n" +
                        "There is a correspondence also between this energy-flow and our emotional reactions.\n" +
                        "\n" +
                        "When we react happily to anything, the energy flows upward through ida and at the same time we inhale. When we react unhappily, the energy flows downward through pingala and we exhale.\n" +
                        "\n" +
                        "Ida and pingala are the channels of reactive energy. That energy is superficial.\n" +
                        "\n" +
                        "Within the spine is what is known as the sushumna, where an upward flow of energy leads to spiritual awakening.\n" +
                        "\n" +
                        "By centering our consciousness in the superficial spine (the ida and pingala), we concentrate our likes and dislikes there, where our thoughts and emotions manifest their reactions to outer circumstances.\n" +
                        "\n" +
                        "These reactions carry the mind outward by focusing its attention on the circumstances instead of inwardly, on the reactions themselves.\n" +
                        "\n" +
                        "We can use the mind to overrule the senses. Paramhansa Yogananda once shared this story with the monks in Mount Washington:\n" +
                        "Detach yourself, control the reactive process, live the teachings. – Nayaswami Maria\n" +
                        "\n" +
                        "    The mind potential is considerable, even without the addition of divine power. One day I was traveling in this country by train. It was a very hot summer day, and the train had no air conditioning. Everyone was suffering in the heat. I said to those who were with me: “See what a little concentration can do. I will meditate on the thought of icebergs.” Minutes later, I held out an arm for them to feel. It was ice cold.\n" +
                        "\n" +
                        "Develop Equanimity\n" +
                        "\n" +
                        "As we retrace pleasure and pain back from outer effect to inner cause — to the reactive process itself, in its place of origin in the spine — we learn to control our involvement in the ups and downs of life.\n" +
                        "\n" +
                        "We thereby develop equanimity instead of projecting our likes and dislikes onto a world we can do little to improve anyway. We calm the reactive process in ourselves and thus remain always peaceful and happy, regardless of outer circumstances.\n" +
                        "\n" +
                        "Reacting positively is still to react and by so doing to identify ourselves with outwardness. Because the universe, moreover, is founded on duality, every positive reaction must perforce be succeeded by a negative one; every ascent in the superficial spine through ida must be succeeded by a downward movement through pingala — even as a ball thrown into the air must come down again.\n" +
                        "\n" +
                        "The yogi instead learns to always be inwardly “evenminded and cheerful.” Interestingly, by the very act of calming our emotional reactions to circumstances, we find ourselves able to influence outer circumstances far more than people do who dance unceasingly in reaction to them.\n" +
                        "\n" +
                        "    I am evenminded and cheerful under all circumstances.\n" +
                        "    Swami Kriyananda\n" +
                        "\n" +
                        "Once the reactive process has been stilled, you find joy welling up constantly in the deep spine. It is a joy that, because it exists in the Self and not outwardly in duality, has no neutralizing opposite.\n" +
                        "Right Attitude\n" +
                        "\n" +
                        "An attitude of titiksha (evenmindedness and non-attachment) is the first step to interiorizing the mind and to bringing its reactions under control. To practice titiksha, concentrate on your reactions to things rather than on the things you think cause the reactions. An important way of practicing titiksha is to watch the breath.\n" +
                        "\n" +
                        "By retracing this reactive process from the periphery of awareness ever more deeply to our center in the spine, we develop the mindset that ultimately brings us to pratyahara: interiorization of the mind.\n" +
                        "Interiorization of the Mind\n" +
                        "\n" +
                        "The process of pratyahara begins with observation of the breath. Awareness of the breath is traced back to the corresponding movements of energy in the spine.\n" +
                        "\n" +
                        "Gradually, the breath becomes calm and the reactive energies are brought under control. As the meditator ceases mentally to dance the jig of life’s ups and downs, he develops centeredness in the inner Self. It is after this point is reached that meditation, properly so-called, can begin.\n" +
                        "\n" +
                        "Hong-Sau will help you convert ego-consciousness into the complete awareness of who and what you truly are: a manifestation of Pure Consciousness.\n" +
                        "\n" +
                        "Paramhansa Yogananda makes an extraordinary statement in the Rubaiyat of Omar Khayyam Explained regarding the inner world of the soul. After describing the interrelationship of the mind and body through the nerves, he writes:\n" +
                        "\n" +
                        "    As the life-force moves down the spine and out to the body and its senses, the mind is drawn outward also. Sense-stimulation from within impels one to seek fulfillment in sense-pleasures.\n" +
                        "\n" +
                        "The same nervous system, however, constitutes the one and only path to spiritual enlightenment, regardless of formal religious affiliation. When the energy can be coaxed to reverse its flow from the senses to the brain, it reveals to our consciousness another world.\n" +
                        "Practices for Emotional Balance\n" +
                        "Calmness and Evenmindedness\n" +
                        "\n" +
                        "Be calm in yourself, evenminded and cheerful through the gains and losses of life. Then in the calm deep meditation feel the joy of the soul. Hold on to that joy through all activities. Don’t confine it, but try to ever expand it, until your little joy becomes the joy of God.\n" +
                        "—Swami Kriyananda, Affirmations for Self-Healing\n" +
                        "\n" +
                        "    In a storm the surface of the ocean knows no peace. Similarly, as long as the storm of delusion rages in the human mind, a person knows no peace, but only tension and anxiety.\n" +
                        "\n" +
                        "Peace comes when the storm is stilled, whether outwardly in Nature or inwardly in a person’s consciousness. As the storm of maya subsides, the wave of the ego subsides also. As the devotee’s ego diminishes, he relaxes and accepts once again his connection with the infinite Spirit.\n" +
                        "—Paramhansa Yogananda, The Essence of Self-Realization\n" +
                        "\n" +
                        "Here are a few other affirmations you may find helpful from Affirmations for Self-Healing by Swami Kriyananda:\n" +
                        "Affirmation for Even Mindedness\n" +
                        "\n" +
                        "I remain untouched by gain or loss. In the calm mirror\n" +
                        "of my understanding, I behold Thy light reflected.\n" +
                        "Affirmation for Joy\n" +
                        "\n" +
                        "I am evenminded and cheerful at all times.\n" +
                        "I know that joy is not outside me, but within.\n" +
                        "\n" +
                        "This video provides some useful and proven techniques and practices to calm emotions and bring you into the present.\n" +
                        "Wisdom-Guided Will\n" +
                        "\n" +
                        "Paramhansa Yogananda emphasized that the mind should control the emotions. The more you can live in the consciousness that you are one with the soul, the more you will be able to have control over your body and emotions.\n" +
                        "\n" +
                        "Will power is a tremendous force in life, the power by which you can reach the heights of God-realization or go down into the deepest state of ignorance.\n" +
                        "\n" +
                        "Wisdom is the soul’s intuitive, direct knowledge of truth. Your will should be always guided by wisdom.\n" +
                        "\n" +
                        "God gave us the tools of wisdom and will, to make the right choices. Don’t let your will be devitalized and weakened by bad habits, desires, and emotions. When you follow bad habits and indulge in them, you have given up your freedom and became a slave.\n" +
                        "\n" +
                        "Swami Kriyananda clarified this further in a Treasures Along the Path talk, “Overcoming Stress and Fear”:\n" +
                        "\n" +
                        "    Conditions are always neutral. They seem good or bad according to the positive or negative attitude of the mind. We can make the best of even the worst circumstances. We have to be practical but the important thing is to have faith in God and to live in the thought that God is with you always. Faith in God will give you the level of relaxation you need to fight the battles of life most effectively.\n" +
                        "\n" +
                        "By daily meditation and vigilant adherence to the guidance of Paramhansa Yogananda and Swami Kriyananda, we can attain a state of evenmindedness.\n" +
                        "https://www.lahiri-mahasaya.org/\n" +
                        "\n" +
                        "Here is a powerful chant to help tune into our oneness with God. It was a favorite of Lahiri Mahasaya, Yogananda’s paramguru.\n" +
                        "No Birth, No Death (listen on YouTube)\n" +
                        "\n" +
                        "Sanskrit chant by Swami Shankaracharya\n" +
                        "Translated by Paramhansa Yogananda\n" +
                        "\n" +
                        "No birth, no death, no caste have I.\n" +
                        "Father, mother, have I none.\n" +
                        "I am He, I am He; blessed Spirit, I am He.\n" +
                        "\n" +
                        "Mind, nor intellect, nor ego, feeling;\n" +
                        "Sky, nor earth, nor metals am I.\n" +
                        "I am He, I am He; blessed Spirit, I am He.\n" +
                        "\n" +
                        "Beyond all fancy, formless am I.\n" +
                        "Free from dreams of all earthly life.\n" +
                        "I am He, I am He; Blessed Spirit I am He.\n" +
                        "\n" +
                        "Bondage I fear not, I’m free in Thy joy.\n" +
                        "Free, Oh free Lord, free in Thy Bliss.\n" +
                        "I am He, I am He; blessed Spirit I am He.",
                "Meditation: The Key to Evenmindedness");
    }
}
