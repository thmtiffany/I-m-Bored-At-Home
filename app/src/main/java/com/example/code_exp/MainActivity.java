package com.example.code_exp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.net.URL;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button button;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    TextView textView;

    Random r;

    String[] items = {
            "Netflix Party \nGet the extension of Netflix online to watch movies with friends",

            "House Party \nApplication can be downloaded from App Store or PlayStore",

            "Zoom Video chat with your friends",

            "Skype Video chat with your friends"

    };

    String [] itemsa = {
            "Words With Friends \nSimilar to scrabble, play with friends online",
            "Skribbl io \nhttps://skribbl.io",
            "Telegram Werewolf \nPlayed on Telegram application with friends \nFind out more at : https://www.tgwerewolf.com",
            "Haxball \nhttps://www.haxball.com/",
            "Codenames \nhttps://www.horsepaste.com/",
            "Among us \nApplication can be downloaded from App Store or PlayStore",
            "Psych! \nApplication can be downloaded from App Store or PlayStore",
            "Drawphone \nhttps://drawphone.tannerkrewson.com/",
            "Spyfall \nhttps://www.spyfall.app/"

    };

    String [] Quiz = {
            "Personality test \nhttps://www.16personalities.com/free-personality-test",
            "What’s your love language? \nhttps://www.5lovelanguages.com",
            "Political compass \nhttps://www.politicalcompass.org/",
            "How You'd Do As A Suspect In A Police Procedural Drama \nhttps://openpsychometrics.org/tests/HEMCR/",
            "IQ \nhttps://iqtest.com/",
            "EQ \nhttps://greatergood.berkeley.edu/quizzes/ei_quiz",
            "BuzzFeed Quizzes \nhttps://www.buzzfeed.com/quizzes",
            "Beano Quizzes \nhttps://www.beano.com",
            "How much of a chaotic good are you? \nhttp://easydamus.com/alignmenttest.html",
            "O*net interest profiler \nhttps://www.mynextmove.org/explore/ip",
            "Harvard Musical IQ Test \nhttps://www.themusiclab.org/quizzes/miq",
            "Sporcle \nhttps://www.sporcle.com/",
            "Jetpunk \nhttps://www.jetpunk.com/",
            "Lovatts Crosswords and Puzzles \nhttps://lovattspuzzles.com/online-puzzles-competitions/ultimate-online-trivia-quiz/",
            "Triviaplaza \nhttps://www.triviaplaza.com/"
};

    String [] diy = {
            "Origami \nhttps://origami.me/diagrams/",
            "Aquabeads \nCustomize your own with just aquabeads and water",
            "Using egg-cartons creatively \nhttps://www.parents.com/fun/arts-crafts/kid/creative-egg-carton-crafts/",
            "Tie-dye Clothes \nhttps://www.parents.com/fun/arts-crafts/kid/how-to-tie-dye-shirts/",
            "Tomato planter with plastic bottles \nhttps://www.thecraftycrow.net/2010/04/upside_down_tomato_planter_tutorial.html",
            "Paper flowers \nhttps://www.hgtv.com/design/make-and-celebrate/handmade/easy-diy-paper-flowers",
            "Handmade ice-cream necklace \nhttps://www.handmadecharlotte.com/pom-pom-ice-cream-necklaces/"
    };

    String [] recipes = {
            "Dalgona Coffee\n" +
                    "\n" +
                    "2 tablespoons of instant coffee powder\n" +
                    "2 tablespoons of hot water\n" +
                    "2 tablespoons of sugar\n" +
                    "\n" +
                    "1.Fresh milk\n" +
                    "2.Place all of the ingredients in a bowl and whisk until fluffy and light brown\n" +
                    "3.Pour suitable amount of fresh milk into cup\n" +
                    "4.Place whisked coffee on top\n",
            "Classic Black Milk Tea w/ Tapioca Pearls (1 serving)\n" +
                    "\n" +
                    "Ingredients\n" +
                    "Black Milk Tea:\n" +
                    "hot water\n" +
                    "black tea bags\n" +
                    "fresh milk \n" +
                    "Sugar (optional)\n" +
                    "\n" +
                    "1.Steep 2 teabags with hot water and let it sit until desired tea flavour is achieved\n" +
                    "2.Add your preferred amount of milk and ice \n" +
                    "3.Add sugar\n" +
                    "\n" +
                    "Tapioca Pearls:\n" +
                    "tapioca flour\n" +
                    "Freshly boiled water\n" +
                    "Sugar syrup\n" +
                    "\n" +
                    "1.Place 3 tablespoons of tapioca flour into a bowl\n" +
                    "2.Add 2 tablespoons of hot water into the bowl\n" +
                    "3.Mix the tapioca flour and the water together with a spoon until they form a dough-like consistency that stays together\n" +
                    "4.Transfer the dough to a flat surface and knead the dough until it is smooth\n" +
                    "5.Roll the dough out and then cut and separate it into small and even pieces that can be rolled into small balls\n" +
                    "6.Roll the each piece into a small ball\n" +
                    "7.Bring 2 cups of water to a boil in a pot\n" +
                    "8.Add the tapioca balls into the pot and cook for about 15 minutes or until desired consistency is achieved\n" +
                    "9.Remove heat and let the pearls rest to cool down\n" +
                    "10.Transfer the pearls into a small bowl with sugar syrup\n" +
                    "Source:(https://mothership.sg/2020/04/bubble-tea-recipe-circuit-breaker/)",
            "Brownies\n" +
                    "\n" +
                    "Ingredients:\n" +
                    "\n" +
                    "½ cup unsalted butter, melted and hot\n" +
                    "1 tablespoon of cooking oil\n" +
                    "1 ⅛ cup of sugar\n" +
                    "2 eggs\n" +
                    "2 teaspoons of pure vanilla extract\n" +
                    "½ cup of all purpose/plain flour\n" +
                    "½ cup unsweetened cocoa powder\n" +
                    "¼ teaspoon salt\n" +
                    "Chocolate chips, crushed nuts, etc. (optional)\n" +
                    "\n" +
                    "Preheat oven to 175°C.\n" +
                    "Lightly grease an 8-inch square baking pan with cooking oil spray. Line with parchment/baking paper, then set it aside.\n" +
                    "Combine hot melted butter, oil and sugar together in a bowl. Whisk well for a minute. Add the eggs and vanilla extract, then beat until lighter in colour. (for another minute)\n" +
                    "Sift in flour, cocoa powder and salt. Fold the dry ingredients into the wet ingredients until they are just combined. (Do not over beat as it will affect texture of brownies)\n" +
                    "Pour batter into prepared pan and evenly smooth out the top. (optional: Add chocolate chips, etc.)\n" +
                    "Bake for 20-25 minutes, or until the centre of the brownies in the pan does not jiggle and is just set to the touch. (if tested with a toothpick, it should come out dirty for fudge-textured brownies)\n" +
                    "Remove and allow to cool to room temperature before slicing into pieces.\n" +
                    "\n" +
                    "(Source: https://cafedelites.com/best-fudgy-cocoa-brownies/)\n",
            "Famous Amos Cookies\n" +
                    "Ingredients:\n" +
                    "\n" +
                    "250g butter\n" +
                    "1 1/4 cups brown sugar\n" +
                    "2 1/2 cups all purpose flour\n" +
                    "1/2 cup corn flour\n" +
                    "2 cups chocolate chips\n" +
                    "1 tsp vanilla essence\n" +
                    "1 tsp baking powder\n" +
                    "1 tsp sodium bicarbonate\n" +
                    "6 tbsp vegetable oil\n" +
                    "1 egg\n" +
                    "Almond nibs (optional)\n" +
                    "In a bowl, combine butter, brown sugar, vanilla essence, egg, and mix well.\n" +
                    "Add all remaining ingredients (except chocolate chips) and mix well again.\n" +
                    "Finally, add chocolate chips into cookie batter and mix again. (Optional: add almond nibs after chocolate chips and mix)\n" +
                    "Refrigerate the cookie dough for 30 minutes.\n" +
                    "Preheat the oven to 150°C. Coat the baking tray with some butter. Roll cookie dough into small balls and distance them.\n" +
                    "Bake for 20 minutes until cookies turn golden brown.\n" +
                    "(Source: https://mothership.sg/2020/05/cookie-recipe/)\n",
            "Triple Chocolate Cookies\n" +
                    "\n" +
                    "Ingredients:\n" +
                    "200g unsalted room temp butter\n" +
                    "300g powdered sugar\n" +
                    "1 egg\n" +
                    "275g self-raising flour\n" +
                    "75g cocoa powder\n" +
                    "Dash of milk\n" +
                    "Chocolate bar of your choice\n" +
                    "\n" +
                    "Set oven to 200 degrees Celsius\n" +
                    "Add butter and powdered sugar into a bowl and mix well\n" +
                    "Crack the egg into the bowl and continue mixing\n" +
                    "Add self-raising flour and cocoa powder into the bowl then mix\n" +
                    "Pour a dash of milk into the mixture\n" +
                    "Break the chocolate bar apart and add into the mixture and fold it into the cookie dough\n" +
                    "Form palm-sized chunks of cookie dough and place them on a baking tray lined with a baking sheet\n" +
                    "Put into the oven to bake for 11 minutes\n" +
                    "Take the cookies out and leave to cool for 45 minutes\n" +
                    "\n" +
                    "(Source: Tanya Burr’s Cookbook “Tanya Bakes”)\n"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());

        r = new Random();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(items[r.nextInt(items.length)]);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(itemsa[r.nextInt(itemsa.length)]);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText((Quiz[r.nextInt(Quiz.length)]));
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(diy[r.nextInt(diy.length)]);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(recipes[r.nextInt(recipes.length)]);
            }
        });
    }
}