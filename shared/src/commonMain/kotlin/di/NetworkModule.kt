package di

import RemoteDataSource
import RemoteDataSourceImpl
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val networkModule = module {
    singleOf<RemoteDataSource> { RemoteDataSourceImpl() }
}