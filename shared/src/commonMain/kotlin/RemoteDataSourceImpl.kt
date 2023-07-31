class RemoteDataSourceImpl: RemoteDataSource {
    override suspend fun getPosts(): List<String>{

        return listOf("post1", "post2", "post3")

    }
}