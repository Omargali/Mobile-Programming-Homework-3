package com.example.hw_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hw_3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mangaList: ArrayList<Manga>
    private lateinit var mangaAdapter: MangaAdapter
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mangaList = ArrayList()
        mangaAdapter = MangaAdapter(mangaList)
        foodListItems()

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.adapter = mangaAdapter
    }

    private fun foodListItems() {
        mangaList.add(Manga(R.drawable.img1, "Solo Leveling", "10 years ago, a gate opened to another world where people are allowed to kill monsters. This is how hunters appeared, pursuing and destroying creatures. But not each of them is destined to increase their level and become stronger. Song Jin-Woo was a low-ranking E-rank hunter who had no chance of moving up the rank ladder until one day he accidentally found himself in a D-rank dungeon. "))
        mangaList.add(Manga(R.drawable.img2, "One Piece", "The last words spoken by the Pirate King Gol D. Roger before his execution inspired many to take to sea: “My treasure? I will bequeath them to whoever can find them. Search! I left everything in one place!” Deprived of sleep and peace, people rushed to the Grand Line, the most dangerous place in the world. Thus began the great era of pirates..."))
        mangaList.add(Manga(R.drawable.img3, "Tokyo Revengers", "A cruel story about a twenty-six-year-old guy who lost his only girlfriend in the dismantling of street gangs and slipped into the gray, miserable life of a poor loser at a part-time job, without any plans or prospects.\n" +
                "But one evening, returning home, the poor fellow was hit by an electric train and rolled back in time twelve years."))
        mangaList.add(Manga(R.drawable.img4, "Boku no Hero Academia", "One fine day, people with superpowers, in other words, quirks, began to appear.\n" +
                "\n" +
                "This is how a society of superhumans arose, where almost every person had some kind of superpower."))
        mangaList.add(Manga(R.drawable.img5, "The beginning after the end", "King Gray has unrivaled power, wealth and prestige in a world dominated by military might. However, loneliness usually appears precisely among those who have great power. Few people know, but under the glamorous appearance of a powerful king hides the shell of a man devoid of purpose and will."))
        mangaList.add(Manga(R.drawable.img6, "Onepunch-Man", "The manga is about a young man named Saitama. He is a hero, an ordinary hero. His main problem is that he knocks the wind out of villains with one blow. And this is very boring..."))
        mangaList.add(Manga(R.drawable.img7, "Wind Breaker", "Windbreaker is a drama about young street racers who dream of freedom. The main character, Ja Hyun, is the son of successful parents and the best student in his school. He never knew what it meant to “fight for his dream,” because his whole life was determined by his parents, who want only one thing for their son—successful completion of school. "))
        mangaList.add(Manga(R.drawable.img8, "Demon Slayer", "Beginning of the 20th century, Taisho era. The family of Tanjiro, a kind coal merchant, is attacked by a demon. Only Nezuko, Tanjiro's younger sister, manages to survive, but she herself becomes a demon. To return his sister to human form and take revenge on the killer, Tanjiro hits the road! An adventure full of splashes of blood and the shine of blades begins!"))
        mangaList.add(Manga(R.drawable.img9, "Naruto", "Twelve years ago, the powerful Nine-Tailed Demon Fox attacked the ninja village of Konoha. The demon was quickly defeated and sealed into an infant named Naruto Uzumaki. But for this, the main ninja of Konoha, the fourth hokage had to sacrifice his life... "))
        mangaList.add(Manga(R.drawable.img10, "Attack on titan", "The human world fell under the crushing power of the Titans. Sacrificing their freedom, humanity took refuge in high-walled cities, hoping to keep the survivors safe. But one terrible day a colossal Titan appeared, surpassing even the city walls in size. And the fragile hope crumbled to dust. The desperate battle for survival began again."))
    }
}
