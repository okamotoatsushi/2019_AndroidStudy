package com.sample.droider.legacyrecipeapp;

import androidx.recyclerview.widget.RecyclerView;

import com.sample.droider.legacyrecipeapp.activity.RecipeListActivity;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
public class RecipeListActivityTest {
    private RecipeListActivity recipeListActivity;
    @Before
    public void setUp() {
        // onCreateまで実行されたActivityオブジェクト
        recipeListActivity = Robolectric.buildActivity(RecipeListActivity.class).create().get();
    }

    @Test
    public void recyclerViewSizeTest() {
        RecyclerView recyclerView = recipeListActivity.findViewById(R.id.recycler);
        Assert.assertEquals(recyclerView.getAdapter().getItemCount(), 0);
    }
}
