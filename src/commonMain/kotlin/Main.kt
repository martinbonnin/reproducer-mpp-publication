import com.apollographql.apollo.api.ApolloExperimental

@ApolloExperimental
fun hello() {
  println(GetRandomQuery::class.simpleName)
}