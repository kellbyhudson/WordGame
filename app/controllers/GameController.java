package controllers;

import models.Words;
import play.data.DynamicForm;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.HashSet;
import java.util.Set;

public class GameController extends Controller
{
    private Set<Words> usedMadLib = new HashSet<>();
    private FormFactory formFactory;

    @Inject
    public GameController(FormFactory formFactory)
    {
        this.formFactory = formFactory;
    }

    public Result getStart()
    {
        return ok(views.html.start.render());
    }

    public Result getFirstStory()
    {
        Words words = new Words();
        words.setPlace1("Parking Lot");
        words.setAdjective1("fuzzy");
        words.setNoun1("truck");
        words.setNoun2("squirrel");
        words.setVerbPastTense1("infected");

        return ok(views.html.story.render(words));
    }

    public Result getSecondStory()
    {
        Words words = new Words();
        words.setPlace1("Louis' Camper Trailer");
        words.setAdjective1("ruthless");
        words.setNoun1("doll");
        words.setNoun2("flame");
        words.setVerbPastTense1("waxed");

        return ok(views.html.story.render(words));
    }

    public Result getThirdStory()
    {
        Words words = new Words();
        words.setPlace1("Corner Store");
        words.setAdjective1("uppity");
        words.setNoun1("hammer");
        words.setNoun2("clover");
        words.setVerbPastTense1("viewed");

        return ok(views.html.story.render(words));
    }

    public Result getRandomStory()
    {
        Words words = new Words();
        words.setRandomPlace1();
        words.setRandomAdjective1();
        words.setRandomNoun1();
        words.setRandomNoun2();
        words.setRandomVerbPastTense1();
        if (!usedMadLib.add(words))
        {
            getRandomStory();
        }
        return ok(views.html.story.render(words));
    }

    public Result getMyOwnStory()
    {
        return ok(views.html.selectwords.render());
    }

    public Result postMyOwnStory()
    {
        DynamicForm form = formFactory.form().bindFromRequest();

        String place1 = form.get("place1");
        String adjective1 = form.get("adjective1");
        String noun1 = form.get("noun1");
        String noun2 = form.get("noun2");
        String verb1 = form.get("verb1");

        Words words = new Words();
        words.setPlace1(place1);
        words.setAdjective1(adjective1);
        words.setNoun1(noun1);
        words.setNoun2(noun2);
        words.setVerbPastTense1(verb1);

        return ok(views.html.story.render(words));
    }
}
