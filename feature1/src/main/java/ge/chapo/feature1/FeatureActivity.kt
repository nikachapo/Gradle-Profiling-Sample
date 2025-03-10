package ge.chapo.feature1

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

        androidx.constraintlayout.widget.R.drawable.abc_text_select_handle_right_mtrl_light
        viewModel.loadData()
    }
}
