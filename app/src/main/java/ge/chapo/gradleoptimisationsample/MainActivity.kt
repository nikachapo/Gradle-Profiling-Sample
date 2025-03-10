package ge.chapo.gradleoptimisationsample

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ge.chapo.feature1.FeatureActivity
import ge.chapo.feature1.db.User
import ge.chapo.gradleoptimisationsample.db.AppDatabase
import ge.chapo.gradleoptimisationsample.ui.theme.GradleOptimisationSampleTheme
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GradleOptimisationSampleTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }

        GlobalScope.launch {
            AppDatabase.getInstance(this@MainActivity).userDao().getAllUsers()
            AppDatabase.getInstance(this@MainActivity).userDao().insertUser(
                User(1, "", "")
            )
            AppDatabase.getInstance(this@MainActivity).userDao2().insertUser(
                ge.chapo.feature2.db.User(1, "", "")
            )
            AppDatabase.getInstance(this@MainActivity).userDao3().insertUser(
                ge.chapo.feature3.db.User(1, "", "")
            )
        }

        when (20) {
            1 -> startActivity(Intent(this, FeatureActivity::class.java))
            2 -> startActivity(Intent(this, ge.chapo.feature2.FeatureActivity::class.java))
            3 -> startActivity(Intent(this, ge.chapo.feature3.FeatureActivity::class.java))
            4 -> startActivity(Intent(this, ge.chapo.feature4.FeatureActivity::class.java))
            5 -> startActivity(Intent(this, ge.chapo.feature5.FeatureActivity::class.java))
            6 -> startActivity(Intent(this, ge.chapo.feature6.FeatureActivity::class.java))
            7 -> startActivity(Intent(this, ge.chapo.feature7.FeatureActivity::class.java))
            8 -> startActivity(Intent(this, ge.chapo.feature8.FeatureActivity::class.java))
            9 -> startActivity(Intent(this, ge.chapo.feature9.FeatureActivity::class.java))
            10 -> startActivity(Intent(this, ge.chapo.feature10.FeatureActivity::class.java))
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GradleOptimisationSampleTheme {
        Greeting("Android")
    }
}