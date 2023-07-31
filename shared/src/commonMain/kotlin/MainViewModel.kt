import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.launch
import org.koin.core.component.KoinComponent
import org.koin.core.component.get

class MainViewModel: ViewModel(), KoinComponent {

    private val remoteDataSource = get<RemoteDataSource>()

    private var _posts = mutableStateOf<List<String>>(emptyList())
    var posts : State<List<String>> = _posts

    init {
        loadPosts()
    }

    private fun loadPosts(){
        viewModelScope.launch {
            _posts.value = remoteDataSource.getPosts()
        }
    }

}