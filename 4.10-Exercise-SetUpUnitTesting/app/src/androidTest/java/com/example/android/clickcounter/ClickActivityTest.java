package com.example.android.clickcounter;

import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * @author Lucas Campos
 */
public class ClickActivityTest {

    @Rule
    public ActivityTestRule<ClickActivity> activityRule = new ActivityTestRule<>(ClickActivity.class);

    @Test
    public void shouldIncrementWhenClickOnButton() throws Exception {
        onView(withId(R.id.click_count_text_view)).check(matches(withText("0")));

        onView(withId(R.id.click_button)).perform(click());

        onView(withId(R.id.click_count_text_view)).check(matches(withText("1")));

        onView(withId(R.id.click_button)).perform(click());

        onView(withId(R.id.click_count_text_view)).check(matches(withText("2")));
    }
}