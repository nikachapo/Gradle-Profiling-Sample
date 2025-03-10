package ge.tbcbank.feature5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class FeatureActivity : AppCompatActivity() {

    private val viewModel: FeatureViewModel = FeatureViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.data.observe(this) { data ->
            // Handle data (e.g., display in TextView)
            println("Data received: $data")
        }

        viewModel.loadData()
    }
}
