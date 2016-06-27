package com.epicodus.madlibs;

import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class MainActivityInstrumentationTest {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void validateEditText() {
        onView(withId(R.id.noun1EditText)).perform(typeText("Spaghetti"))
                .check(matches(withText("Spaghetti")));
    }

    @Test
    public void noun1IsSentToStoryActivity() {
        String noun1 = "Dinosaur";
        String story = "A long, long time ago, in the Kingdom of Dinosaur, there lived a stupid giant. His only desire in the world was to  as many people as possible. These people must be  or he would refuse to  them. Suddenly, a magnificent hero named  appeared! He was accompanied by his miniature , Bub.  and Bub made sure that the stupid giant never  or  again.";
        onView(withId(R.id.noun1EditText)).perform(typeText(noun1));
        onView(withId(R.id.libsSubmitButton)).perform(click());
        onView(withId(R.id.storyTextView)).check(matches(withText(story)));
    }


}
