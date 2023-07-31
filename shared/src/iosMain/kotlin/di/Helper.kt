package di

import org.koin.core.component.KoinComponent
import org.koin.core.context.startKoin

class NetworkHelper: KoinComponent {
}

fun initKoin(){
    startKoin {
        modules(appModule())
    }
}