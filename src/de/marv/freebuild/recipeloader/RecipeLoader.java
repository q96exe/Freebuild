package de.marv.freebuild.recipeloader;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

public class RecipeLoader {

    public void recipeRegister() {
        ItemStack feather = new ItemStack(Material.FEATHER);
        ItemMeta featherMeta = feather.getItemMeta();
        featherMeta.setDisplayName("§a§lTest");
        feather.setItemMeta(featherMeta);

        ShapedRecipe featherrecipe = new ShapedRecipe(feather);


    }

}
