interface RemoteDataSource {
    suspend fun getPosts(): List<String>
}