package lyssa.tupy.findrepo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class SearchResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_result)
        title = "ResultsHel"

        val searchTerm = intent.getStringExtra("searchTerm")
        println(searchTerm)
    }
}