package oops

import scala.collection.mutable.ArrayBuffer


@main
def runNetworkServer(): Unit = {

  val articles = ArrayBuffer[BlogArticles]()
  articles.addOne(BlogArticles("Artificial Intelligence", "AI Agents use in real world", 350))
  articles.addOne(BlogArticles("Sustainable Energy", "Ways of Generating Sustainable energy", 100))

  val newBlog = articles(0).copy(title = "AI Agents")
  articles.addOne(newBlog)

  readArticles(articles.toList)

}


case class BlogArticles( title: String, content: String, readers: Int)


def readArticles(blogs: List[BlogArticles]): Unit = {
  blogs.foreach {blog => println(s"Article Data : $blog")}
}