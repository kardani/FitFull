import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import dev.icerock.moko.mvvm.compose.getViewModel
import dev.icerock.moko.mvvm.compose.viewModelFactory

@Composable
fun App() {

    val viewModel  = getViewModel(Unit, viewModelFactory { MainViewModel() })
    val posts  by viewModel.posts

    MaterialTheme {

        ItemsList(
            posts = posts
        )
    }
}

@Composable
fun ItemsList(
    posts: List<String>
) {

//    var greetingText by remember { mutableStateOf("Hello, World!") }
//    var showImage by remember { mutableStateOf(false) }

    Box(Modifier.fillMaxWidth()){

        LazyColumn {
            items(posts) {
                Text(it)
            }
        }

    }
//    Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
//        Button(onClick = {
//            greetingText = "Hello, ${getPlatformName()}"
//            showImage = !showImage
//        }) {
//            Text(greetingText)
//        }
//        AnimatedVisibility(showImage) {
//            Image(
//                painterResource("compose-multiplatform.xml"),
//                null
//            )
//        }
//    }
}

expect fun getPlatformName(): String