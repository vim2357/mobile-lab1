
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lab1.R
import kz.kbtu.assignment1.Post

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val posts = listOf(
            Post(R.drawable.ic_launcher_foreground, "Post 1: Hello World!"),
            Post(R.drawable.ic_launcher_foreground, "Post 2: Another post"),
            Post(R.drawable.ic_launcher_foreground, "Post 3: Last post")
        )

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = PostAdapter(posts)
    }
}
